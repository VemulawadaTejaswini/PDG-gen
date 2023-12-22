import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int n = a, b = 0;
		while(0 < a) {
			b += a%10; a /= 10;
		}
		if(n % b == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
