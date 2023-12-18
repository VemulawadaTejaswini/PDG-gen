
import java.lang.reflect.Array;
import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<Integer> a = new LinkedList<Integer>();
		for(int i=1;i<=n;i++){
			a.add(sc.nextInt());
		}
		Collections.sort(a);
		
		int ans = 0;
		String s = String.valueOf(a.pollFirst());
		String sss = String.valueOf(a.pollFirst());
		String ss = String.valueOf(a.pollFirst());
		if(n==3)
			ans = Integer.parseInt(sss+s);
		else
			ans = Integer.parseInt(s+ss);
		System.out.println(ans);
		
	}
}
