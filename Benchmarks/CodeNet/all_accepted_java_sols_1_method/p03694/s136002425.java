import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for(int i = 1; i <= n; i++) a[i] = sc.nextInt();
		int min = a[1], max = a[1];
		for(int i = 2; i <= n; i++) {
			if(min > a[i]) min = a[i];
			else if(max < a[i]) max = a[i];
		}
		System.out.println(max - min);
	}

}
