import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Main {
	private static final int a[] = {0,0,0,0,0,0,0,0,0,0};

	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(buf);
				int n = Integer.parseInt(st.nextToken());
				int s = Integer.parseInt(st.nextToken());
				if (n>10||330<s) System.out.println(0);
				else System.out.println(solve(n,s,1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int solve(int n,int s,int d) {
		if (n==0) {
			if (s==0) {
				//for (int i=0;i<a.size();i++) {
				//	if (i==0) System.out.print(a.get(i));
				//	else System.out.print("+"+(i+1)+"*"+a.get(i));
				//}
				//System.out.println("+"+(a.size()+1)+"*"+add);
				return 1;
			}
			else {
				return 0;
			}
		} else if (s<0) return 0;

		int count = 0;
		for (int i=0;i<=9;i++) {
			if (a[i]==0) {
				a[i] = 1;
				count += solve(n-1,s-i*d,d+1);
				a[i] = 0;
			}
		}
		return count;
	}
}