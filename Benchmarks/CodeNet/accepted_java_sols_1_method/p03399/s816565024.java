import java.util.Scanner;

class Main{

	//static long[] a;



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int A =sc.nextInt();
		int B =sc.nextInt();
		int C =sc.nextInt();
		int D =sc.nextInt();

		System.out.println(Math.min(A, B)+Math.min(C, D));
	}
}


