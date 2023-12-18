import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//The Most Powerful Spell
public class Main{

	static class E{
		public int s;
		public int t;
		public String spell;
		public E(int s, int t, String spell) {
			super();
			this.s = s;
			this.t = t;
			this.spell = spell;
		}
	}

	static String[][] dp;
	static boolean[][] flag;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int a = sc.nextInt();
			int s = sc.nextInt();
			int g = sc.nextInt();
			if((n|a|s|g)==0)break;
			List<E> edge = new ArrayList<E>();
			for(int i=0;i<a;i++){
				edge.add(new E(sc.nextInt(), sc.nextInt(), sc.next()));
			}
			dp = new String[n][241];
			flag = new boolean[n][241];
			String[] ans = new String[n];
			Arrays.fill(ans, "");
			for(int i=0;i<n;i++)for(int j=0;j<=240;j++)dp[i][j]=null;
			dp[s][0] = "";
			flag[s][0] = true;
			int loopCount = 0;
			boolean update = true;
			while(loopCount <= 10000 && update){
				update = false;
				for(int i=0;i<n;i++){
					for(int j=0;j<=240;j++){
						if(flag[i][j]){
							flag[i][j] = false;
							for(E e:edge){
								if(e.s == i){
									String next = dp[i][j] + e.spell;
									if(next.length() > 240 && next.compareTo(ans[e.t]) < 0){
										loopCount = 10000;
										break;
									}
									else if(next.length() <= 240 && (dp[e.t][next.length()]==null || next.compareTo(dp[e.t][next.length()])<0)){
										update = true;
										flag[e.t][next.length()] = true;
										dp[e.t][next.length()] = next;
										if(ans[e.t].equals("") || next.compareTo(ans[e.t]) < 0){
											ans[e.t] = next;
//											System.out.println(e.t + " is UPDATE:" + ans[e.t]);
										}
									}
								}
							}
						}
					}
				}
//				System.out.println(loopCount + " : " + update);
				loopCount++;
			}
			if(loopCount > 10000)System.out.println("NO");
			else System.out.println(ans[g].equals("")?"NO":ans[g]);
		}
	}
}