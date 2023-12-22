import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), d = sc.nextInt();
		System.out.println((int)Math.ceil(n * 1.0 / (2 * d  + 1)));
	}
}
