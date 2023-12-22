import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int tmp;
		for(int i = 0; i < n; i++) {
			for(int k = i + 1; k < n; k++) {
				if(a[i] < a[k]) {
					tmp = a[i];
					a[i] = a[k];
					a[k] = tmp;
				}
			}
		}
		int count = 1;
		for(int i = 0; i < n - 1; i++) {
			if(a[i] > a[i + 1]) {
				count++;
			}
		}
		System.out.println(count);
	}
}