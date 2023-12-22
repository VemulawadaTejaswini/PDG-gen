import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Set<Integer> set = new HashSet<>();
		int ac = 0, wa = 0;
		int[] cnt = new int[n+1];
		for(int i=0;i<m;i++) {
			int p = sc.nextInt();
			String s = sc.next();
			
			if(s.equals("WA"))
				cnt[p]++;
			else {
				if(!set.contains(p)) {
					ac++;
					wa+=cnt[p];
					set.add(p);
				}
			}
		}
		
		System.out.println(ac+" "+wa);
	}
}
