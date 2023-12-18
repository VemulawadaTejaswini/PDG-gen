import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		long yen = in.nextLong();
		long temp = yen%1000;
		if (temp!=0) {
			System.out.println(1000-temp);
		}else {
			System.out.println(temp);
		}
		
	}
}