import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String T = br.readLine();
		String[] a = S.split(" ");
		String[] b = T.split(" ");
		int asum = 0;
		int bsum = 0;
		for(int i = 0 ; i < 4 ; i ++){
			asum+=Integer.parseInt(a[i]);
			bsum+=Integer.parseInt(b[i]);
		}
		System.out.println((asum>bsum)?asum:bsum);
	}
}