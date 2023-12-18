import java.util.*;
import java.io.PrintWriter;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// N人の社員,配列を0(=まずは上司なし)初期化
		int N = Integer.parseInt(sc.next());
        Integer syain[] = new Integer[N+1];
        Arrays.fill(syain, 0);

        // 社員の上司IDに +1 していく
        for (int i=2; i<=N; i++) {
          int joushi = Integer.parseInt(sc.next());
          syain[joushi] += 1;
        }

        // 直属の部下の人数を出力
        for(int i=1; i<syain.length; i++) {
            System.out.println( syain[i]);
        }
	}
}