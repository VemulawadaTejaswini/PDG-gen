import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int p = sc.nextInt();
			int r = sc.nextInt();
			if(n==0 && p==0 && r==0) break;
			
			int[] s = new int[n];
			int[] t = new int[n];
			int[][] map = new int[n][p];
			int a, b, c;
			String d;
			for(int i=0;i<r;i++){
				a = sc.nextInt()-1;
				b = sc.nextInt()-1;
				c = sc.nextInt();
				d = sc.next();
				
				if(d.compareTo("WRONG")==0) map[a][b]++;
				else{
					t[a] += map[a][b]*1200 + c;
					s[a]++;
				}
			}
			
			int f;
			PriorityQueue<Integer> que = new PriorityQueue<Integer>();
			for(int i=p;i>=0;i--){
				for(int j=0;j<n;j++){
					if(s[j]==i && que.contains(t[j])==false) que.add(t[j]);
				}
				while(que.size()!=0){
					f = que.poll();
					for(int j=0;j<n;j++){
						if(s[j]==i && t[j]==f) System.out.println((j+1) + " " + i + " " + t[j]);
					}
				}
				que.clear();
			}
		}	
	}	
}