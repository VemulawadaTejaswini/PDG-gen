
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String line = sc.nextLine();
			Scanner s = new Scanner(line);
			int[] a = new int[5];
			a[0] = s.nextInt();
			a[1] = s.nextInt();
			a[2] = s.nextInt();
			a[3] = s.nextInt();
			a[4] = s.nextInt();
			Arrays.sort(a); 
			printReverse(a);
		}
	}

	
	static void printReverse(int[] a) {
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]);
			if (i == 0)
				break;
			System.out.print(" ");
		}
		System.out.println();
	}
}