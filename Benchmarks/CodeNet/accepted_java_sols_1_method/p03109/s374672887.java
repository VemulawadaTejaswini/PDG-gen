import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] c = S.split("/");
		if (Integer.parseInt(c[1]) > 4) {
			System.out.println("TBD");
		}
		else System.out.println("Heisei");
	}

}