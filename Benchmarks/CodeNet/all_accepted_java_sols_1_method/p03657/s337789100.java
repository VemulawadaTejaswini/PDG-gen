import java.util.*;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A % 3 == 0 || B % 3 == 0 || (A+B) % 3 == 0) {
			System.out.println("Possible");
		} else {
			System.out.println("Impossible");
		}
	}
}