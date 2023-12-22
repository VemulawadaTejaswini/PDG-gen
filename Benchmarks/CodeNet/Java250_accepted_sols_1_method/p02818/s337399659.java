import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		long A = stdIn.nextLong();
		long B = stdIn.nextLong();
		long K = stdIn.nextLong();
		if(A >= K){
			System.out.println((A - K) + " "  + B);
		}
		else{
			K = K - A;
			if(B >= K){
				System.out.println(0 + " " + (B - K));
			}
			else{
				System.out.println("0 0");
			}
		}
		stdIn.close();
	}
}
