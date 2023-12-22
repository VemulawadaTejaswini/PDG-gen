import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int even = sc.nextInt();
		int odd = sc.nextInt();
		//奇数+奇数か偶数+偶数しかありえない
		if(even == 0) {
			System.out.println(odd*(odd-1)/2);
			return;
		}
		if(odd == 0) {
			System.out.println(even*(even-1)/2);
			return;
		}
		
		System.out.println( odd*(odd-1)/2 + even*(even-1)/2);
		
	}
		
}