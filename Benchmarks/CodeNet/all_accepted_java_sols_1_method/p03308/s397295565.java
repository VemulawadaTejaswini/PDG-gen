import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int A = 0;
		Integer maxA = Integer.MIN_VALUE;//MIN_VALUEで最小値を代入
		Integer minA = Integer.MAX_VALUE;//MAX_VALUEで最大値を代入
		for(int i=0; i<N; i++) {
			A = sc.nextInt();
          	
            minA = Math.min(minA,A);//Aの最小値を求める
			maxA = Math.max(maxA,A);//Aの最大値を求める
			
		}
		//最大値から最小値を引いた数を表示する
		System.out.println(maxA-minA);
	}
}