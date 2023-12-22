import java.util.Scanner;

//6/9コンテスト

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int A=a+b;
		int B=a+c;
		int C =c+b;

		int min=A;
		if(B<A) {
			min=B;
			if(C<B) {
				min=C;
			}
		}
		else if(C<A) {
			min=C;
			if(B<C) {
				min=B;
			}
		}

		System.out.println(min);



	}

}
