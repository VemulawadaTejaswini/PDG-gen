import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		int S = scan.nextInt();
		int h = S / (60 * 60);
		int m = (S - 60 * 60 * h) / 60;
		int s = (S - 60 * 60 * h ) % 60;
		System.out.printf("%d:%d:%d\n", h, m, s);
	}
}