
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int n;
		int[] ans;
		String str;
		String[] s;
		str = bf.readLine();
		n = Integer.parseInt(str);
		str = bf.readLine();
		s = str.split(" ");
		ans = new int[n];
		for(int i = 0;i < n;++i) {
			ans[Integer.parseInt(s[i])-1] = i+1;
		}
		for(int i = 0;i < n;++i) {
			System.out.print(ans[i]);
			if(i != n-1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}