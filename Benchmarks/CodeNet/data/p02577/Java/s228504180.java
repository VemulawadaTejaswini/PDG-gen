import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

public class Main {
	//2-100
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String string = in.next();
		int sum = 0;
		for (int i = 0; i < string.length(); i++) {
			sum+=string.charAt(i)-48;
		}
		if (sum%9==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}