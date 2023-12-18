import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] cnt = new int[100000];
		Long ans = 0l;
		
		for(int i = 0 ; i < n ; i++) {
			int a =Integer.parseInt(sc.next());
			cnt[a]++;
			ans += a;
		}
		
		int q = Integer.parseInt(sc.next());
		for(int i = 0 ; i < q ; i++) {
			int b = Integer.parseInt(sc.next());
			int c = Integer.parseInt(sc.next());
			cnt[c] += cnt[b];
			
			ans += (c- b)*cnt[b];
			cnt[b] = 0;
			System.out.println(ans);
		}

		
	}
}


