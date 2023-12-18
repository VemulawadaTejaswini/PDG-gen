
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		long ans = 0,sum = 0,temp;
		int n;
		long[] a;
		String str;
		String[] s;
		str = bf.readLine();
		n = Integer.parseInt(str);
		str = bf.readLine();
		s = str.split(" ");
		a = new long[n];
		for(int i = 0;i < n;++i) {
			a[i] = Long.parseLong(s[i]);
			sum += a[i];
		}
		for(int i = 0;i < n-1;++i) {
			sum -= a[i];
			temp = sum%1000000007;
			ans = (ans + a[i]*temp)%1000000007;
		}
		System.out.println(ans);
	}
}