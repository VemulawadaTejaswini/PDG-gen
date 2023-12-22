import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int N = 0,A = 0,B = 0,x = 0;
		
		N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		x = N * A;
		
		if(x <= B) {
			System.out.print(x);
		}else {
			System.out.println(B);
		}
	}
}
