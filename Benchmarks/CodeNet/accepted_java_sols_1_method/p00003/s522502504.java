import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a;
		int b;
		int c;
		int N = stdIn.nextInt();
		int count = 0;
		int box;
		while (true) {
			if(N<=0){
			break;
			}
			a = stdIn.nextInt();
			b = stdIn.nextInt();
			c = stdIn.nextInt();
			if (a < b) {
				box = a;
				a = b;
				b = box;
			}
			if (a < c) {
				box = a;
				a = c;
				c = box;
			}
			a = a * a;
			b = b * b;
			c = c * c;
			if (a == b + c)
				System.out.println("YES");
			else
				System.out.println("NO");
			count=count+1;
			if (count == N){
				break;
			}
		}
	}
}