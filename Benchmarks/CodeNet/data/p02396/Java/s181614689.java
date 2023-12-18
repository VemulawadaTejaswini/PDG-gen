import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int kaisu = 5;
		int[] num = new int[kaisu];

		for(int i = 0; num[i] != 0 ; i++) {
			int nums = scan.nextInt();
			System.out.println("Case " + i+1 + ":" + nums);
		}
 }
}