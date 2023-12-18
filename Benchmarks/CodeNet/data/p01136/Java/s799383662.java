
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			@SuppressWarnings("unchecked")
			ArrayList<Integer>[] l = new ArrayList[30];
			for(int i=0;i<30;i++)
				l[i] = new ArrayList<Integer>();
			
			for(int i=0;i<n;i++){
				int m = sc.nextInt();
				for(int j=0;j<m;j++){
					l[sc.nextInt()-1].add(i);
				}
			}
			solve(n, l);
		}
	}

	public void solve(int n, ArrayList<Integer>[] l) {
		long[] have = new long[n];
		for(int i=0;i<n;i++)
			have[i] |= (1<<i);
		int res = -1;
		long ok = (1<<n)-1;
		for(int i=0;i<l.length;i++){
			for(int j=0;j<l[i].size();j++){
				for(int k=j+1;k<l[i].size();k++){
					int p1 = l[i].get(j);
					int p2 = l[i].get(k);
					have[p1] |= have[p2];
					have[p2] |= have[p1];
				}
			}
			for(int j=0;j<n;j++){
				if(have[j]==ok){
					res = i+1;
					break;
				}
			}
			if(res!=-1)
				break;
		}
		System.out.println(res);
	}

}