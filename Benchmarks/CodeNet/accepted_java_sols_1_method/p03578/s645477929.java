
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		int k = Integer.parseInt(num);
		int[] sum = new int[k];
		num = br.readLine();
		String[] str = num.split(" ", 0);
		for (int i = 0; i < k; i++) {
			sum[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(sum);
		num = br.readLine();
		int n = Integer.parseInt(num);
		int[] sum2 = new int[n];
		num = br.readLine();
		String[] str2 = num.split(" ", 0);
		for (int i = 0; i < n; i++) {
			sum2[i] = Integer.parseInt(str2[i]);
		}
		Arrays.sort(sum2);
		int check = 0;
		for(int i=0;i<k;i++) {
			if(sum2[check]== sum[i]) {
				check++;
				if(check==n) {
					break;
				}
			}
		}
		if(check==n) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}