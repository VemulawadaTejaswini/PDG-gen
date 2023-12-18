import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			int[][] map = new int[n][n];
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			int min;
			for(int i=0;i<n;i++){
				min = Integer.MAX_VALUE;
				for(int j=0;j<n;j++){
					map[i][j] = sc.nextInt();
					min = Math.min(min, map[i][j]);
				}
				list.add(min);
			}
			
			int max;
			int ans = 0;
			for(int i=0;i<n;i++){
				max = 0;
				for(int j=0;j<n;j++){
					max = Math.max(max, map[j][i]);
				}
				if(list.contains(max)==true){
					ans = max;
					break;
				}
			}
			System.out.println(ans);
		}
	}	
}