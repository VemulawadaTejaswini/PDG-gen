
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		
		if(N%7==0 || N%4==0) {
			System.out.println("Yes");
			System.exit(0);
		}
		int x = N / 7;
		int y;
		for(int i=0; i<=x; i++) {
			y = N - 7*i;
			if(y%4==0) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
		in.close();
	}
}