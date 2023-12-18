import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[3];
		
		for(int i = 0; i < 3; i++) {
			n[i] = sc.nextInt();
		}
		
		Arrays.sort(n);
		
		for(int i = 0; i < 3; i++) {
			if(i != 2) {
				System.out.print(n[i] + " ");
			} else {
				System.out.print(n[i]);
			}
		}
		
		System.out.println();
	}
}