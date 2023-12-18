import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n, m;
		n = scanner.nextInt();
		m = scanner.nextInt();
		
		Integer[] a = new Integer[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			sum += a[i];
		}
		Arrays.sort(a, Collections.reverseOrder());
		double under = sum / ( m * 4.0 );
		
		if(a[m - 1] >= under)
			System.out.println("Yes");
		else 
			System.out.println("No");
		

		scanner.close();
	}

}
