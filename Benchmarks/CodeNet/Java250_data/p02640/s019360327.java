import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		
		Scanner in = new java.util.Scanner(System.in);
		int X = in.nextInt();
		int Y = in.nextInt();
		int B = Y - 2*X;
		if(B>=0 &&  B%2==0) {
			int b = B/2;
			if(X-b >= 0) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
		
		in.close();
	}
}
