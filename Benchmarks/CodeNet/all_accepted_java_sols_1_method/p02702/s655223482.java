import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length(), tmp;
		long[] bef = new long[2019], aft = new long[2019];
		long ans = 0;
		for(int i = 0; i < n; i++){
			tmp = str.charAt(i)-'0';
			aft[tmp]++;
			for(int k = 0; k < 2019; k++){
				aft[(k*10+tmp)%2019] += bef[k];
			}
			ans += aft[0];
			for(int j = 0; j < 2019; j++){
				bef[j] = aft[j];
			}
			Arrays.fill(aft, 0);
		}
		System.out.println(ans);
	}
}
