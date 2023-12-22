import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] p = new int[3];
		p[0] = Integer.parseInt(sc.next());
		p[1] = Integer.parseInt(sc.next());
		p[2] = Integer.parseInt(sc.next());


		Arrays.sort(p);

		int ans = p[0] +p[1];
		System.out.println(ans);
	}

}