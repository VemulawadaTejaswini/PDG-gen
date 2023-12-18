import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String g[][] = new String[h][w];
		String f[] = new String[h];
		for(int i=0; i<h; i++){
			f[i] = sc.next();
		}
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				g[i][j] = String.valueOf(f[i].charAt(j));
			}
		}

		int cc = 0;
		int countw[] = new int[h];
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				if(g[i][j].equals("."))countw[i]++;
			}
			if(countw[i]==w){
				for(int j=0; j<w; j++){
					g[i][j]="";
				}
			cc++;
			}
		}
		

		int counth[] = new int[w];
		for(int i=0; i<w; i++){
			for(int j=0; j<h; j++){
				if(g[j][i].equals("."))counth[i]++;
			}			
			if(counth[i]==h-cc){
				for(int k=0; k<h; k++){
					g[k][i]="";
				}
			}
		}

		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				System.out.print(g[i][j]);
			}
			if(countw[i]!=w)System.out.println("");
		}
	}
}