import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Integer> grp1 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
	static List<Integer> grp2 = Arrays.asList(4, 6, 9, 11);
	static List<Integer> grp3 = Arrays.asList(2);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[2];
		for (int i = 0; i < 2; i++) {
			int num = sc.nextInt();
			if(grp1.contains(num)) a[i] = 1;
			if(grp2.contains(num)) a[i] = 2;
			if(grp3.contains(num)) a[i] = 3;
		}
		if(a[0] == a[1]) System.out.println("Yes");
		else System.out.println("No");
	}
}