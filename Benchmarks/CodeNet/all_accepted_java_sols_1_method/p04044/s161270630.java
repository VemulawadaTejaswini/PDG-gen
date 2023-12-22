import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ary = new String[sc.nextInt()];
		sc.next();
		for(int i=0;i < ary.length;i++) {
			ary[i] = sc.next();
		}
		Arrays.parallelSort(ary);
		for (String string : ary) {
			System.out.print(string);
		}
		System.out.println();
	}
}