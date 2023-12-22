import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] l = new int[3];
		while (n-->0) {
			l[0] = s.nextInt();
			l[1] = s.nextInt();
			l[2] = s.nextInt();
			Arrays.sort(l);
			System.out.println((l[0]*l[0]+l[1]*l[1]-l[2]*l[2] == 0)?"YES":"NO");
		}
	}
}