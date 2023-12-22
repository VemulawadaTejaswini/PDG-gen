import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		Long ans = 0l;
		for(int i = 1 ; i < n ; i++) {
			
			if(a[i] < a[i-1]) {
				ans += a[i-1] - a[i];
				a[i] = a[i-1];
			}
		}
		
		System.out.println(ans);
	}

}


