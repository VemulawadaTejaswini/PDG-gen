import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		int max = 0; 
		int cnt = 0;
		for(i=0; i<n; i++) {
			h[i] = sc.nextInt();
			if(max <= h[i]) {cnt++; max = h[i];}
		}
		sc.close();
		sc = null;
		System.out.println(cnt);
	}
}