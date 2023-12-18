import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			int[][] map = new int[n][n];
			int[] minH = new int[n];
			int[] maxV = new int[n];
			for(int i=0;i<n;i++) minH[i] = Integer.MAX_VALUE;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					map[i][j] = sc.nextInt();
					minH[i] = Math.min(minH[i], map[i][j]);
				}
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					maxV[i] = Math.max(maxV[i], map[j][i]);
				}
			}
			boolean flag = false;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(maxV[i]==minH[j]){
						System.out.println(maxV[i]);
						flag = true;
					}
				}
			}
			if(flag==false) System.out.println("0");
			
		}
	}	
}