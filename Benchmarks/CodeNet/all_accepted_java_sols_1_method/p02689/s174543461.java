
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Integer>[] P;
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int m = Integer.parseInt(sc.next());
		
		int []d = new int [n];
		for(int i = 0 ; i < n ;i++) {
			d[i] = Integer.parseInt(sc.next());
		}
		P = new ArrayList [n];
		for(int i = 0 ; i < n ;i++) {
			P[i] = new ArrayList <Integer>();
		}
		
		for(int i = 0 ; i < m ;i++) {
			int a = Integer.parseInt(sc.next())-1;
			int b = Integer.parseInt(sc.next())-1;
			P[a].add(b);
			P[b].add(a);
		}
		int ans = 0;
		
		for(int i = 0 ; i < n ;i++) {
			int temp = d[i];
			boolean jdg = true;
			for(int num : P[i]) {
				if(d[num] >= temp) {
					jdg = false;
					break;
				}
			}
			if(jdg) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
