import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int max = 0;
		int max2 = 0;
		int[] ans = new int[n+1];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if(a[i] > max) {
				max2 = max;
				max = a[i];
			} else if(a[i] > max2) {
				max2 = a[i];
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(a[i] != max) {
				ans[i] = max;
			} else {
				ans[i] = max2;
			}
			System.out.println(ans[i]);
		}
		
	}

}
