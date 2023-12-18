import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int[][] map = new int[n+1][4];
			for(int i=0;i<=n;i++){
				for(int j=0;j<4;j++){
					map[i][j] = sc.nextInt();
				}
			}
			
			boolean out = true;
			boolean flag = true;
			for(int i=0;i<n;i++){
				flag = true;
				if(map[i][1]>map[n][0]) flag = false; 
				else if(map[i][2]>map[n][1]) flag = false;
				else if(map[i][3]>map[n][2]) flag = false;
				else if(map[i][1]*4+map[i][2]*9+map[i][3]*4>map[n][3]) flag = false;
				if(flag==true){
					System.out.println(map[i][0]);
					out = false;
				}
			}
			if(out==true) System.out.println("NA");
		}
	}	
}