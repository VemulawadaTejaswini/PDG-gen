import java.util.*;

public class Main {
	
	public static final int[] PRIME = new int[]{3 * 5 * 7, 3 * 5 * 11, 3 * 5 * 13, 3 * 3 * 3 * 5, 3 * 3 * 3 * 7};
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < PRIME.length; i++) {
			if (PRIME[i] <= n) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}