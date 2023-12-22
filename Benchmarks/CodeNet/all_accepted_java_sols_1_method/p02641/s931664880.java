import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = scan.nextInt();
		HashSet<Integer> set = new HashSet<>();
		int min = Integer.MAX_VALUE;
		int max = -1;
		for(int i = 0;i < n; ++i){
			int p = scan.nextInt();
			set.add(p);
			min = Math.min(min, p);
			max = Math.max(max, p);
		}
		if (set.size() == 0){
			System.out.print(x);
			return;
		}
		int diff = Integer.MAX_VALUE;
		int ans = max + 1;
		for(int i = max + 1; i >= min-1; --i){
			if(!set.contains(i) && Math.abs(x - i) <= diff){
				ans = Math.min(ans,i);
				diff = Math.abs(x - i);
			}
		}
		System.out.print(ans);

	}
}
