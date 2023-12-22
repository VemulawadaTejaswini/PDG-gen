import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//A
		/*
		int a = sc.nextInt();//前回の記録
		int b = sc.nextInt();//目標
		System.out.println(2*b-a);*/

		//B
		int N = sc.nextInt();//回数
		int K = sc.nextInt();//操作Bで足す値K
		int ans = 1;
		for(int i = 0; i < N ; i++){
			if(ans<K)
				ans = ans*2;	//操作A
			else
				ans += K;		//操作B
		}
		System.out.println(ans);

	}
}
