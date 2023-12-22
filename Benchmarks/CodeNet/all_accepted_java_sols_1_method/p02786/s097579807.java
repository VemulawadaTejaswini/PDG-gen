import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long H = stdIn.nextLong();
		long n = 0;
		while(H>0) {
			H /= 2;
			n++;
		}
		System.out.println((long)Math.pow(2, n)-1);
	}
}
