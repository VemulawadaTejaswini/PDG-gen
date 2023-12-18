import java.util.*;
 
public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Set<String> set=new HashSet<>();
		int ans=0;
		for(int i=0;i<n;i++) {
			String s=sc.next();
			if(!set.contains(s)) {
				set.add(s);
				ans++;
			}
		}
		System.out.print(ans);
	}
}