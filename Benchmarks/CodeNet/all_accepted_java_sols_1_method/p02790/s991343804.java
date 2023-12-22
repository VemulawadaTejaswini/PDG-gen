import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int aa = a;
		int bb = b;
		for(int i=0; i<b-1; i++) {
			aa = aa * 10 + a;
		}
		for(int i=0; i<a-1; i++) {
			bb = bb * 10 + b;
		}
		System.out.println(Math.max(aa, bb));
	}
}