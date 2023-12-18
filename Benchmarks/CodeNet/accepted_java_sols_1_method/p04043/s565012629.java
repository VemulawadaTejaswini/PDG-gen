import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//３つの整数を入力してもらう
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		//575→5が2回、7が1回であればそれぞれカウントするヒープを作る
		int a = 0 , b = 0;

		if(A==5) {
			a++;
		}else if(A==7) {
				b++;
		}

		if(B==5) {
			a++;
		}else if(B==7){
			b++;
		}

		if(C==5) {
			a++;
		}else if(C==7){
			b++;
		}
		//aとｂの数値を判定
		if(a==2 && b==1) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}
}
