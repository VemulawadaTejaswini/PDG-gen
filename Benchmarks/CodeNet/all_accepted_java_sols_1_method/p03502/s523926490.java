import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int tmpN = N;
		int tmpfN=0;
		int fN = 0;
		for (int i = 8; i >= 0; i--) {
			tmpfN = (int)Math.floor(tmpN / Math.pow(10, i));
			fN += tmpfN;
			tmpN -= (int)(tmpfN * Math.pow(10, i));
		}
		if(N%fN==0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}