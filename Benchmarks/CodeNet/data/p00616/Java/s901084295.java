import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int h = sc.nextInt();
			if(n==0 && h==0) break;
			
			int[][][] map = new int[n][n][n];
			
			String s;
			int a, b;
			for(int i=0;i<h;i++){
				s = sc.next();
				a = sc.nextInt()-1;
				b = sc.nextInt()-1;
				if(s.compareTo("xy")==0){
					for(int z=0;z<n;z++) map[z][b][a]++;
				}else if(s.compareTo("xz")==0){
					for(int y=0;y<n;y++) map[b][y][a]++;
				}else{
					for(int x=0;x<n;x++) map[b][a][x]++;
				}
			}
			
			int count = 0;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					for(int k=0;k<n;k++){
						if(map[i][j][k]==0) count++;
					}
				}
			}
			System.out.println(count);
		}	
	}	
}