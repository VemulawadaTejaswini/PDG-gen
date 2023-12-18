import java.util.*;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A < B) {
			if(A + X < B) {
				System.out.println("dangerous");
			} else {
				System.out.println("safe");
			}
		} else {
			System.out.println("delicious");
		}
		
		
		
	}
}