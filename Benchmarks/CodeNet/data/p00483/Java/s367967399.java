import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[][] map = new int[m][n];
			
			String t = "";
			for(int i=0;i<m;i++){
				t = sc.next();
				for(int j=0;j<n;j++){
					if(t.codePointAt(j)==74){
						map[i][j] = 1;
					}else if(t.codePointAt(j)==79){
						map[i][j] = 2;
					}
				}
			}
			
			int a, b, c, d, cj, co, ci;
			
			for(int i=0;i<k;i++){
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				d = sc.nextInt();
				cj = 0;
				co = 0;
				
				for(int p=a-1;p<c;p++){
					for(int q=b-1;q<d;q++){
						if(map[p][q]==1){
							cj++;
						}else if(map[p][q]==2){
							co++;
						}
					}
				}
				ci = (c-a+1)*(d-b+1)-cj-co;
				
				System.out.println(cj + " " + co + " " + ci);
			}
		}
	
	}	
}