import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int p;
			int[][] map = new int[n][31];
			for(int i=0;i<n;i++){
				p = sc.nextInt();
				for(int j=0;j<p;j++) map[i][sc.nextInt()]++;
			}
			
			boolean flag = false;
			boolean check = true;
			int[] temp = new int[n];
			int[][] list = new int[n][n];
			ArrayDeque<Integer> que = new ArrayDeque<Integer>();
			for(int i=1;i<=30;i++){
				for(int j=0;j<n;j++){
					if(map[j][i]>0){
						que.offer(j);
						list[j][j]++;
						for(int k=0;k<n;k++) temp[k] += list[j][k];
					}
				}
				while(que.size()!=0){
					p = que.poll();
					list[p] = temp.clone();
				}
				
				check = false;
				for(int j=0;j<n;j++){
					if(temp[j]==0){
						check = true;
						break;
					}
				}
				
				if(check==false){
					System.out.println(i);
					break;
				}
				
				Arrays.fill(temp, 0);
			}
			if(check==true) System.out.println(-1);
		}	
	}	
}