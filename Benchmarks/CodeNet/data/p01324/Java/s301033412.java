import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = Integer.valueOf(sc.nextLine());
			if(n==0) break;
			
			int[][] cost = new int[200][200];
			for(int i=0;i<200;i++) Arrays.fill(cost[i], Integer.MAX_VALUE);
			ArrayList<String> list = new ArrayList<String>();
			int p, q, r;
			for(int i=0;i<n;i++){
				String[] s = sc.nextLine().replace('^', ' ').split(" ");
				if(list.contains(s[1])==false) list.add(s[1]);
				if(list.contains(s[5])==false) list.add(s[5]);
				p = list.indexOf(s[1]);
				q = list.indexOf(s[5]);
				r = Integer.valueOf(s[4]);
				cost[q][p] = r;
				cost[p][q] = -r;
			}
			
			boolean flag = false;
			int m = list.size();
			for(int i=0;i<m;i++) cost[i][i] = 0;
			for(int i=0;i<m;i++){
				for(int j=0;j<m;j++){
					for(int k=0;k<m;k++){
						if(cost[j][i]!=Integer.MAX_VALUE && cost[i][k]!=Integer.MAX_VALUE){
							if(cost[j][k]==Integer.MAX_VALUE){
								cost[j][k] = cost[j][i]+cost[i][k];
							}else if(cost[j][k] != cost[j][i]+cost[i][k]){
								flag = true;
								k = m;
								j = m;
								i = m;
							}
						}
					}
				}
			}
			
			if(flag==false) System.out.println("Yes");
			else System.out.println("No");
		}	
	}	
}