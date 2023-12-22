import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int[] boo = new int[100000];
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] st = br.readLine().split(" ");
		//boolean[] boo = new boolean[100000];
		
		for (int i = 0; i < n; i++) {
			boo[Integer.parseInt(st[i])%100000] = 1;
		}
		
		int ans = 0;
		n = Integer.parseInt(br.readLine());
		st = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			ans += boo[Integer.parseInt(st[i])%100000] ;
		}
		System.out.println(ans);
	}
}