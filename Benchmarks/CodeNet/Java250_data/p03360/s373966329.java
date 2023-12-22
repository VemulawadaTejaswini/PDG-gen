
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] list = new int[3];
		for (int i = 0; i < 3; i++) {
			list[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		Arrays.sort(list);
		
		int ans = (int) (Math.pow(2, k) * list[2]) + list[0] + list[1];
		System.out.println(ans);
		
	}
}