
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int n,q,l,r,ans;
		String str;
		String[] s,stemp;
		int[] list;
		str = bf.readLine();
		stemp = str.split(" ");
		n = Integer.parseInt(stemp[0]);
		q = Integer.parseInt(stemp[1]);
		list = new int[n];
		str = bf.readLine();
		s = str.split("");
		if(s[0].equals("A") && s[1].equals("C")) {
			list[0] = 1;
		}
		for(int i = 1;i < n-1;++i) {
			if(s[i].equals("A") && s[i+1].equals("C")) {
				list[i] = list[i-1] + 1;
			} else {
				list[i] = list[i-1];
			}
		}
		list[n-1] = list[n-2];
		for(int i = 0;i < q;++i) {
			str = bf.readLine();
			stemp = str.split(" ");
			l = Integer.parseInt(stemp[0])-1;
			r = Integer.parseInt(stemp[1])-1;
			if(l == 0) {
				ans = list[r-1];
			} else {
				ans = list[r-1] - list[l-1];
			}
			System.out.println(ans);
		}
	}
}