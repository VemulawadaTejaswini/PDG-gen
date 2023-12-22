import java.util.Scanner;

/**
 * 
 * @author morisin
 * 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int L[] = new int[100];
		
		int sum = 0;
		int max = 0;
		boolean writable = false;
		
		for(int i=0;i<N;i++) {
			int input = sc.nextInt();
			L[i] = input;
			sum += L[i];
			if (L[i] > max) {
				max = L[i];
			}
		}
		
		if (max < sum - max) {
			writable = true;
		}
		
		System.out.println(writable ? "Yes" : "No");
	}

}
