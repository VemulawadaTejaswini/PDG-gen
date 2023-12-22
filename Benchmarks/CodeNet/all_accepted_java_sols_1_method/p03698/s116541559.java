import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] s = str.split("",0);
			int[] a = new int[128];
			Arrays.fill(a, 0);
			for(int i =0;i<s.length;i++) {
				if(a[s[i].getBytes()[0]]==0) {
					a[s[i].getBytes()[0]]++;
				}else {
					System.out.println("no");
					break;
				}
				if(i==s.length-1) {
					System.out.println("yes");
				}
			}
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}
}
