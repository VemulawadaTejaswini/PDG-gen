import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, ans = 0;
		
		n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; ++i) {
			int tmp = sc.nextInt();
			a[i] = tmp;
		}
		
		Arrays.sort(a);
		
		int count = 1;
		
		for(int i = 0; i < n - 1; ++i) {
			if(a[i] == a[i + 1])
				count++;
			else {
				if(count % 2 == 1)ans++;
				count = 1;
			}
		}
		
		if(count % 2 == 1)ans++;
		
		sc.close();
			System.out.println(ans);
	}

}
