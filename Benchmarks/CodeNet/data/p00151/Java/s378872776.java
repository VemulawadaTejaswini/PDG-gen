import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			int[][] mapV = new int[n+2][n+2];
			int[][] mapH = new int[n+2][n+2];
			int[][] mapRU = new int[n+2][n+2];
			int[][] mapRD = new int[n+2][n+2];
			
			String s = "";
			int max = 0;
			for(int i=1;i<=n;i++){
				s = sc.next();
				for(int j=1;j<=n;j++){
					if(s.codePointAt(j-1)==49){
						mapV[i][j] = mapV[i-1][j]+1;
						mapH[i][j] = mapH[i][j-1]+1;
						mapRU[i][j] = mapRU[i-1][j+1]+1;
						mapRD[i][j] = mapRD[i-1][j-1]+1;
						max = Math.max(Math.max(Math.max(Math.max(mapV[i][j], mapH[i][j]), mapRU[i][j]),mapRD[i][j]),max);
					}
				}
			}
			System.out.println(max);
		}
	}	
}