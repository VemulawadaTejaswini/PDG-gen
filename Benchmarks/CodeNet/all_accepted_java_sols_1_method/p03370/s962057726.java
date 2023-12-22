import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] m = new int[n];
		int min = 0;
		int sum = 0;
		m[0] = sc.nextInt();
		min = m[0];
		sum = m[0];
		for(int i=1; i<n; i++) {
			m[i] = sc.nextInt();
			min = min<m[i]?min:m[i];
			sum = sum + m[i];
		}
		
		int sub = x - sum;
		int count = sub/min;
		System.out.println(count + n);
		
		
	}

}
