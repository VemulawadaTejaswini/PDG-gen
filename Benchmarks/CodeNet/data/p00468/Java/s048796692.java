import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		while(true){
			int n = Integer.parseInt(scan.next());
			int m = Integer.parseInt(scan.next());
			if(n==0) break;
			V[] ver = new V[n];
			for (int i = 0; i < n; i++) ver[i] = new V();
			boolean[] used = new boolean[n];

			for (int i = 0; i < m; i++) {
				int a = Integer.parseInt(scan.next())-1;
				int b = Integer.parseInt(scan.next())-1;
				ver[a].to.add(b);
				ver[b].to.add(a);
			}

			Stack<int[]> stk = new Stack<int[]>();
			stk.push(new int[]{0,0});
			used[0]=true;
			int ans = 0;
			while(!stk.isEmpty()){
				int[] p = stk.pop();
				int num = p[0],deep = p[1];
				ans++;
				if(deep!=2) for (Integer i : ver[num].to) {
					if(!used[i]){
						used[i]=true;
						stk.push(new int[]{i,deep+1});
					}
				}
			}
			out.println(ans-1);
		}
		out.flush();
	}
}

class V{
	ArrayList<Integer> to = new ArrayList<Integer>();
}