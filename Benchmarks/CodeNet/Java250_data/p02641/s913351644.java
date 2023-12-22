import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = scan.nextInt();
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0;i < n; ++i){
			set.add(scan.nextInt());
		}
		int diff = 99999;
		int ans  = x;
		for(int i = 0;i <= 101; ++i){
			if(!set.contains(i)){
				if(Math.abs(i-x) < diff){
					ans = i;
					diff = Math.abs(i-x);
				}
			}
		}
		System.out.print(ans);
	}
}
