import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int c =A*N;
		if(B>c) {
			System.out.println(c);
		}else {
			System.out.println(B);
		}
	}

}