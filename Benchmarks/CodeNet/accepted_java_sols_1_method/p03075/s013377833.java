import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int[] a = {s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()};
		Arrays.sort(a);
		int k = s.nextInt();
		if (a[4] - a[0] > k)	System.out.println(":(");
		else System.out.println("Yay!");
		/*
		1 2 4 8 9 15 ->Yay!
		15 18 26 35 36 18 -> :(
		*/
	}
}
 