import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;
 
public class Main {
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		boolean[] searched = new boolean[n+1];
		for(int i= 0; i < m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < n + 1; i++) {
			searched[i] = false;
		}
		int ans = 0;
		Queue<Integer> friend = new ArrayDeque<>();
		friend.add(a[0]);
		
		label: while(true) {
			//System.out.println(1);
			cnt = 0;
			search(friend.poll(), a, b, searched, friend);
			//System.out.println(cnt);
			if(ans < cnt) {
				ans = cnt;
			}
			for(int i = 0; i < m; ++i) {
				//System.out.println(i);
				//System.out.println((i==(m-1))+" "+i+" "+m);
				if(!searched[a[i]]) {
					//System.out.println(searched[a[i]]);
					friend.add(a[i]);
					continue label;
				}else if(!searched[b[i]]) {
					//System.out.println(searched[b[i]]);
					friend.add(b[i]);
					continue label;
				}else if(i == (m - 1)) {
					break label;
				}
			}
		}
		System.out.println(ans);
	}
		
	public static void search(int root,int[] a,int[] b,boolean[] searched,Queue<Integer> friend) {
		//System.out.println(root);
		searched[root] = true;
		++cnt;
		for(int i = 0; i < a.length; ++i) {
			if(a[i] == root && searched[b[i]] == false) {
				friend.add(b[i]);
				searched[b[i]] = true;
			}else if(b[i] == root && searched[a[i]] == false) {
				friend.add(a[i]);
				searched[a[i]] = true;
			}
		}
		if(friend.peek() != null) {
			search(friend.poll(),a,b,searched,friend);
		}
	}
}