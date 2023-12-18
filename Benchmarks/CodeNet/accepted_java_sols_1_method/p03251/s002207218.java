import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[] xArray = new int[n];
		int[] yArray = new int[m];
		for(int i = 0; i < n; i++)
			xArray[i] = sc.nextInt();
		for(int i = 0; i < m; i++)
			yArray[i] = sc.nextInt();
		int low = Arrays.stream(xArray).max().getAsInt();
		int high = Arrays.stream(yArray).min().getAsInt();
		boolean b = false;
		for(int i = low+1; i <= high && !b; i++)
			b |= x < i && i <= y;
		System.out.println(b ?"No War" :"War" );
	}
}
