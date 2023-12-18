import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int[][] map = new int[n][n];
			for(int i=0;i<n;i++) Arrays.fill(map[i], Integer.MAX_VALUE);
			
			int m = sc.nextInt();
			int p, q;
			for(int i=0;i<m;i++){
				String[] s = sc.next().split(",");
				p = Integer.valueOf(s[0]);
				q = Integer.valueOf(s[1]);
				map[p][q] = Integer.valueOf(s[2])/100 - 1;
				map[q][p] = map[p][q];
			}
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(0);
			int sum = 0;
			int r = 0;
			for(int i=1;i<n;i++){
				q = Integer.MAX_VALUE;
				for(int j=0;j<i;j++){
					p = list.get(j);
					for(int k=0;k<n;k++){
						if(list.contains(k)==false && q>map[p][k]){
							q = map[p][k];
							r = k;
						}
					}
				}
				list.add(r);
				sum += q;
			}
			
			System.out.println(sum);
		}	
	}	
}