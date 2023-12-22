import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		String str = sc.next();
		
		String left = str.substring(0, k-1);
		String right = str.substring(k,n);
		
		String low = String.valueOf(str.charAt(k-1));
		low = low.toLowerCase();
		
		System.out.println(left+low+right);
	}
}
