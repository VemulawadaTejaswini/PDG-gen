import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[][] mapJ = new int[m+2][n+2];
			int[][] mapO = new int[m+2][n+2];
			int[][] mapI = new int[m+2][n+2];
			
			String t = "";
			int pj, po, pi;
			for(int i=1;i<=m;i++){
				t = sc.next();
				for(int j=1;j<=n;j++){
					pj = 0;
					po = 0;
					pi = 0;
					if(t.codePointAt(j-1)==74){
						pj = 1;
					}else if(t.codePointAt(j-1)==79){
						po = 1;
					}else{
						pi = 1;
					}	
					mapJ[i][j] = pj + mapJ[i][j-1] + mapJ[i-1][j] - mapJ[i-1][j-1];
					mapO[i][j] = po + mapO[i][j-1] + mapO[i-1][j] - mapO[i-1][j-1];
					mapI[i][j] = pi + mapI[i][j-1] + mapI[i-1][j] - mapI[i-1][j-1];
				}
			}
			
			int a, b, c, d, cj, co, ci;
			
			for(int i=0;i<k;i++){
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				d = sc.nextInt();

				cj = mapJ[c][d] - mapJ[c][b-1] - mapJ[a-1][d] + mapJ[a-1][b-1];
				co = mapO[c][d] - mapO[c][b-1] - mapO[a-1][d] + mapO[a-1][b-1];
				ci = mapI[c][d] - mapI[c][b-1] - mapI[a-1][d] + mapI[a-1][b-1];
				
				System.out.println(cj + " " + co + " " + ci);
			}
		}
	
	}	
}