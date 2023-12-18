
import java.io.*;


/**
 * AIZU ONLINE JUDGE
 * 2705 Kuru Kuru Door
 *    2018/02/11
 */
public class Main {

    static class Double2 {

        public double x, y;

        public Double2() {/**/}
        public Double2( double xx, double yy ) { x=xx; y=yy; }
        public Double2( Double2 s ) { x=s.x; y=s.y; }

        @Override
        public String toString() {
            return String.format("[%g %g]", x, y);
        }

        // 極座標から構築
        public static Double2 createFromPolar(double r, double theta) {
            return new Double2(r * Math.cos(theta), r* Math.sin(theta));
        }

        public double length2() {
            return x*x + y*y;
        }

        public double length() {
            return Math.sqrt(x * x + y * y);
        }
        public double length2(Double2 d2) {
            return (d2.x - x) * (d2.x - x) + (d2.y - y) * (d2.y - y);
        }
        public double length(Double2 d2) {
            return Math.sqrt((d2.x - x) * (d2.x - x) + (d2.y - y) * (d2.y - y));
        }
        public double atan2() {
            return Math.atan2(y, x);
        }
        public double atan2(Double2 d2) {
            return Math.atan2(d2.y - y, d2.x - x);
        }

        public Double2 add(Double2 d) {
            x += d.x;
            y += d.y;
            return this;
        }
        public Double2 sub(Double2 d) {
            x -= d.x;
            y -= d.y;
            return this;
        }

        // 自分を反転する
        public void inv() {
            x = -x;
            y = -y;
        }
    }

    // ang正規化 -Math.PI <= th <= Math.PI
    static double angNorm(double th) {
        if (th > Math.PI) {
            int k = (int)Math.floor((th + Math.PI) / (Math.PI * 2));
            th -= k * (Math.PI * 2);
        }
        if (th < -Math.PI) {
            int k = (int)Math.floor((-th + Math.PI) / (Math.PI * 2));
            th += k * (Math.PI * 2);
        }
        return th;
    }


    // 片側経路計算 f = 0 上を通る f = 1 下を通る
    // 戻り [0] S-C1までの経路長
    //      [1] ang_c1
    //      [2] Cなしで水平になる場合の中心までの経路長
    double[] kata(int n, double r, double R, Double2 S, Double2 T, int f) {
        log.printf("--- kata S = %s f = %d\n", S, f);
        assert(S.x < 0);
        assert(S.y >= 0);

        double r_c = r / Math.sin(Math.PI / n / 2);
        double total = 0;

        // A
        double ang_A = Math.PI - Math.PI / 2 / n;
        Double2 A = Double2.createFromPolar(R, ang_A);
        log.printf("A = %s\n", A);
        double ang_AS = A.atan2(S);
        log.printf("ang_AS = %f\n", ang_AS);

        // A1 S1
        Double2 A1;
        double ang_AA1;
        double ang_S1 = S.atan2() + Math.acos((R + r) / S.length());
        //if (ang_S1 < ang_A) {
        if (angNorm(ang_S1 - ang_A) < 0) {;
            // 回転ドアの外周にあたる S1あり
            log.printf("S1あり\n");
            Double2 S1 = Double2.createFromPolar(R + r, ang_S1);
            A1 = Double2.createFromPolar(R + r, ang_A);
            ang_AA1 = ang_A;
            total += S.length(S1);
            total += (ang_A - ang_S1) * (R + r);
        }
        else {
            // S1なし
            log.printf("S1なし\n");
            ang_AA1 = ang_AS + Math.acos(r / A.length(S));
            log.printf("ang_aa1 = %f\n", ang_AA1);
            A1 = Double2.createFromPolar(r, ang_AA1);
            A1.add(A);
            double l_SA1 = S.length(A1);
            log.printf("l_SA1 = %f\n", l_SA1);
            total += l_SA1;
        }
        log.printf("A1 = %s\n", A1);

        // A2
        double ang_AA2 = 0;
        if (f == 0) {
            ang_AA2 = ang_A - Math.acos((r_c + r) / R) - Math.PI;
        }
        else if (f == 1) {
            ang_AA2 = ang_A + Math.acos((r_c - r) / R);
        }
        else {
            assert false;
        }
        log.printf("ang_AA2 = %f\n", ang_AA2);
        Double2 A2 = Double2.createFromPolar(r, ang_AA2);
        A2.add(A);
        double th = angNorm(ang_AA2 - ang_AA1);
        if (th < 0) {
            // Aには当たらない
            log.printf("Aには当たらない\n");
            // C1
            double ang_C1 = 0;
            if (f == 0) {
                ang_C1 = S.atan2() - Math.acos(r_c / S.length());
            }
            else {
                ang_C1 = S.atan2() + Math.acos(r_c / S.length());
            }

            log.printf("ang_C1 = %f\n", ang_C1);
            Double2 C1 = Double2.createFromPolar(r_c, ang_C1);
            double l_SC1 = S.length(C1);
            log.printf("l_SC1 = %f\n",  l_SC1);

            return new double[] { l_SC1, ang_C1 };
        }
        double l_A1A2 = th * r;
        log.printf("l_A1A2 = %f\n",  l_A1A2);
        double total_nonC = total;
        double total_T = total;
        total += l_A1A2;

        // C1
        double ang_C1 = 0;
        if (f == 0) {
            ang_C1 = ang_AA2 + Math.PI;
        }
        else {
            ang_C1 = ang_AA2;
        }
        log.printf("ang_C1 = %f\n", ang_C1);
        Double2 C1 = Double2.createFromPolar(r_c, ang_C1);
        double l_A2C1 = A2.length(C1);
        log.printf("l_A2C1 = %f\n",  l_A2C1);
        total += l_A2C1;

        // Cに当たらない場合(仮定)
        double ang_AA2_nonC = -Math.PI / 2;
        log.printf("ang_AA2_nonC = %f\n", ang_AA2_nonC);

        th = angNorm(ang_AA2_nonC - ang_AA1);
        assert(th >= 0); // A当たりチェックずみなので大丈夫のはず
        double l_A1A2_nonC = th * r;
        log.printf("l_A1A2_nonC = %f\n",  l_A1A2_nonC);
        total_nonC += l_A1A2_nonC;
        total_nonC += -A.x; // 直線経路の半分を加算する
        
        // A2からTまで直線の場合(仮定)
        Double2 t = new Double2(T);
        t.sub(A);
        double ang_AA2_T = t.atan2() - Math.acos(r / t.length());
        th = angNorm(ang_AA2_T - ang_AA1);
        //assert(th >= 0); // A当たりチェックずみなので大丈夫のはず
        double l_A1A2_T = th * r;
        log.printf("l_A1A2_T = %f\n",  l_A1A2_T);
        total_T += l_A1A2_T;
        total_T += Math.sqrt(t.length2() - r*r); //aa2.length(t);
        
        log.printf("ret[] = %f %f %f %f\n\n", total, ang_C1, total_nonC, total_T);
        
        return new double[] { total, ang_C1, total_nonC, total_T };
    }
    
    double calc(int n, double r, double R, Double2 S, Double2 T, int ff) {
        double r_c = r / Math.sin(Math.PI / n / 2);

        // y反転したかフラグ
        boolean yinv0 = false;
        boolean yinv1 = false;
        
        Double2 SS = new Double2(S);
        Double2 TT = new Double2(T);
        if (SS.y < 0) {
            yinv0 = true;
            SS.y = -SS.y;
            TT.y = -TT.y;
        }
        double[] ret00 = kata(n, r, R, SS, TT, ff);
//        double[] ret01 = kata(n, r, R, SS, TT, 1-ff);
        double new_ang_C1 = ret00[1];

        SS = new Double2(T);
        SS.inv(); // 180度回転
        TT = new Double2(S);
        TT.inv(); // 180度回転
        if (SS.y < 0) {
            yinv1 = true;
            SS.y = -SS.y;
            TT.y = -TT.y;
        }
        int f = (yinv0 == yinv1) ? 1 : 0;
        if (ff != 0)
            f = 1-f;
//        int f2 = 1 - f;
        double[] ret10 = kata(n, r, R, SS, TT, f);
//        double[] ret11 = kata(n, r, R, SS, TT, f2);
        double new_ang_C2;
//        if (f == 1) {
        if (ff != f) { // TODO
            // 180度回転
            new_ang_C2 = ret10[1] + Math.PI;
        }
        else {
            // x軸反転
            new_ang_C2 = Math.PI - ret10[1];
        }

        double total = 0;
        // C1C2
        double th = angNorm(new_ang_C1 - new_ang_C2);
        if (ff != 0) th = -th; // TODO
        log.printf("-----\nth = %f\n", th);
        if (th < 0) {
            if (ret00.length <= 2 && ret10.length <= 2) {
                // [2]がないのは一直線でいい？
                log.printf("一直線\n");
                total = S.length(T);
            }
            else if (ret00.length <= 2) {
                log.printf("S側一直線\n");
                total = ret10[3];
            }
            else if (ret10.length <= 2) {
                log.printf("T側一直線\n");
                total = ret00[3];
            }
            else {
                // Cなし
                log.printf("Cなし\n");
                total = ret00[2] + ret10[2];
            }
        }
        else {
            assert(0 <= th && th <= Math.PI);
            double l_C1C2 = th * r_c;
            log.printf("l_C1C2 = %f\n", l_C1C2);
            total += ret00[0];
            total += ret10[0];
            total += l_C1C2;
        }
        return total;
    }

	boolean main() throws IOException {

		int[] ir = readIntArray();
		int n = ir[0];
		if (n == 0)
		    return false;

        ir = readIntArray();
        int r = ir[0];
        int R = ir[1];
        ir = readIntArray();
        Double2 S = new Double2(ir[0], ir[1]);
        ir = readIntArray();
        Double2 T = new Double2(ir[0], ir[1]);

		log.printf("n = %d\n", n);
        log.printf("r, R = %d, %d\n", r, R);
        log.printf("S = %s\n", S);
        log.printf("T = %s\n", T);
//        if (S.y == 0)
//            S.y = 0.00001;
//        if (T.y == 0)
//            T.y = 0.00001;
        
        double r_c = r / Math.sin(Math.PI / n / 2);
        log.printf("r_c = %f\n",  r_c); // OからCの中心までの距離

        double total = 0;

        if (r_c + r > R) {
            total = -1; // 到達不能
        }
        else {
            //total = calc(n, r, R, S, T, 0);
            double total0 = calc(n, r, R, S, T, 0);
            double total1 = calc(n, r, R, S, T, 1);
            log.printf("total0 = %f total1 = %f\n",  total0, total1);
            total = Math.min(total0, total1);
        }
        result.printf("%f\n", total);
		return true; // 正常終了 次へ
	}



	static long time0;

    PrintStream log;
    PrintStream result;
    BufferedReader systemin;

    static Main instance = new Main();

    Main() {
        systemin = new BufferedReader(new InputStreamReader(System.in));
        result = System.out;
        log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    }

	public static void main(String[] args) throws IOException {

		int N = Integer.MAX_VALUE;
		//int N = readIntArray()[0];

		for(int i = 0; i < N; i++) {
			boolean b = instance.main();
			if (!b)
				break;
		}

        instance.systemin.close();
	}

	// 標準入力より1行分の区切り文字区切りでの整数値を読む
	// EOFの場合はnullを返す
	private int[] readIntArray() throws IOException {

		String s = null;
		for(;;) {
			s = systemin.readLine();
			if (s == null)
				return null;
			s = s.trim();
			if (s.length() != 0) // 突然空行を読むことがある。読み飛ばすとうまくいくらしい
				break;
		}

		String[] sp = s.split("[ ,]"); // 区切り文字はスペースかカンマ
		int[] a = new int[sp.length];
		for(int i = 0; i < sp.length; i++) {
			a[i] = Integer.parseInt(sp[i]);
		}
		return a;
	}

}


