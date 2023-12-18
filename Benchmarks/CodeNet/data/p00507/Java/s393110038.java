
import java.lang.reflect.Array;
import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		for(int i=1;i<=n;i++){
			a[i] = sc.nextInt();
		}
		LinkedList<Integer> ts = new LinkedList<Integer>();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j)continue;
				String str = String.valueOf(a[i])+String.valueOf(a[j]);
				ts.add(Integer.parseInt(str));
			}
		}
		ts.sort();
		ts.pollFirst();
		ts.pollFirst();
		System.out.println(ts.pollFirst());
		
	}
}
