import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		String s = scan.next();
		
		byte[] sbyte = s.getBytes();
		sbyte[k-1] += 32;
		
		String sa = new String(sbyte);
		
		System.out.println(sa);
		
	}
}