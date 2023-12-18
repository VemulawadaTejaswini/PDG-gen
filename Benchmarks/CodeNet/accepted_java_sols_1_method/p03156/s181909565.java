import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		Arrays.sort(p);
		int one = 0;
		int two = 0;
		int three = 0;
		for(int i = 0; i < n; i++) {
			if(p[i] <= a) {
				one ++;
			}else if(a < p[i] && p[i] <= b) {
				two ++;
			}else {
				three ++;
			}
		}
		int min = Math.min(one, two);
		int ans = Math.min(min, three);
		System.out.println(ans);
		sc.close();
	}
}

