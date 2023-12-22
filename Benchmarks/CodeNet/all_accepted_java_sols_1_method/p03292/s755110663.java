import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = new int[3];
		
		for(int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == j) continue;
				int jc = Math.abs(a[j] - a[i]);
				for(int k = 0; k < 3; k++) {
					if(i == k || j == k) continue;
					int kc = Math.abs(a[k] - a[j]);
					if(ans > jc + kc) ans = jc + kc;
				}
			}
		}
		
		System.out.println(ans);
    }
}
