import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, m, a[], b[];
		int count[];
		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[m];
		b = new int[m];
		count = new int[n];
		
		for(int i = 0; i < m; ++i) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			count[a[i] - 1]++;
			count[b[i] - 1]++;
		}
		
		sc.close();
		
		for(int i:count)System.out.println(i);
	}

}
