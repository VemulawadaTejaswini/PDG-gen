import java.util.*;
import static java.lang.System.*;
import java.io.*;

public class Main {

	Scanner sc;
	
	@SuppressWarnings("unchecked")
	void run() {
		try {
			sc = new Scanner(new File("/Users/ryo/Documents/Others/data/F/input/F1.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		sc = new Scanner(in);
		List<Integer>[] list = new ArrayList[30];
		for (int i = 0; i < 30; i++)
			list[i] = new ArrayList<Integer>();
		
		Set<Integer>[][] dp = new HashSet[31][50];
		for (int i = 0; i < 31; i++)
			for (int j = 0; j < 50; j++)
				dp[i][j] = new HashSet<Integer>();
		
		top:while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			
			for (int i = 0; i < 31; i++)
				for (int j = 0; j < n; j++)
					dp[i][j].clear();
			
			for (int i = 0; i < 30; i++)
				list[i].clear();
		
			for (int i = 0; i < n; i++) {
				int m = sc.nextInt();
				for (int j = 0; j < m; j++) {
					list[sc.nextInt()-1].add(i);
				}
			}
			
			for (int i = 0; i < n; i++)
					dp[0][i].add(i);
			
			for (int t = 1; t <= 30; t++) {
				for (int i = 0; i < list[t-1].size(); i++) {
					for (int j = 0; j < list[t-1].size(); j++) {
						dp[t][list[t-1].get(i)].addAll(dp[t-1][list[t-1].get(j)]);
					}
				}
				for (int i = 0; i < n; i++)
					dp[t][i].addAll(dp[t-1][i]);
				for (int i = 0; i < n; i++) {
					if (dp[t][i].size() >= n) {
						out.println(t);
						continue top;
					}
				}
			}
			out.println(-1);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}