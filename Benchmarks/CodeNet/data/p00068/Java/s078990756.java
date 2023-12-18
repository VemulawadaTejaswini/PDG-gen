import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void io(){
		
		while(true){
			int n = ni();
			if(n==0)
				break;
			
			// 一番左の点から
			int left=0;
			double[][] map = new double[n][2];
			for(int i=0; i<n; ++i){
				map[i] = ndl();
				if(map[i][0] < map[left][0]){
					left = i;
				}
			}
			final int last = left;
			int now = left;
			int count = n;
			// 一番左なので、真上を指すベクトルから
			double[] v = new double[]{0., 1.};
			do{
				--count;
				double min = 360.1;
				int i_best = 0;
				double[] v_best = v;
				for(int i=0; i<n; ++i){
					// 自身以外の全探索
					if(i!=now){
						// 進行方向ベクトル, vに対する角度を求める
						
						// 内積から0~180度の角度を得る
						double[] v_ = new double[]{map[i][0]-map[now][0], map[i][1]-map[now][1]};
						double ab = v[0]*v_[0] + v[1]*v_[1];
						double a_ = Math.sqrt(v[0]*v[0] + v[1]*v[1]);
						double b_ = Math.sqrt(v_[0]*v_[0] + v_[1]*v_[1]);
						double cos_ = ab/(a_*b_);
						double ang_ = Math.toDegrees(Math.acos(cos_));
						
						// 外積で左向いていたら180度げたはかせる
						double axb = v[0]*v_[1] - v[1]*v_[0];
						if(axb > 0){
							ang_ = 360. - ang_;  //(180. - ang_) + 180.
						}
						
						//debug(map[now], map[i], ang_);
						// 方向ベクトルに対する一番時計回りに近い点を得る
						if(ang_ < min){
							min = ang_;
							i_best = i;
							v_best = v_;
						}
					}
				}
				
				// 点の移動
				now = i_best;
				v = v_best;
			}while(now!=last);
			
			// 残りのn(count)が中に入っている点の数
			System.out.println(count);
		}
	}
	
	double[] ndl(){
		String[] str = sc.next().split(",");
		double args[] = new double[2];
		for(int i=0; i<2; ++i){
			args[i] = Double.parseDouble(str[i]);
		}
		return args;
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		new Main().io();
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}