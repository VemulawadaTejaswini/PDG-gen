import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for(int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		int ans = 0;
		int[] b = new int[5];
		int min = 10;
		int idx = 0;
		for(int i = 0; i < 5; i++) {
			b[i] = a[i] % 10;
			if(b[i] < min && b[i] != 0) {
				min = b[i];
				idx = i;
			}
		}
		for(int i = 0; i < 5; i++) {
			if(i != idx) {
				ans += (a[i]/10 + 1) * 10;
				if(b[i] == 0) {
					ans -= 10;
				}
			}
		}
		ans += a[idx];
		System.out.println(ans);
		sc.close();
	}
	
}

