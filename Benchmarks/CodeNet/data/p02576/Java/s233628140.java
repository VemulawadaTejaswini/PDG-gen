import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

public class Main {
	//2-100
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int t = in.nextInt();
		if (n%x==0) {
			int total = n/x;
			System.out.println(total*t);
		}else {
			int total = n/x;
			System.out.println((total+1)*t);
		}
		
		
		
	}
	

}