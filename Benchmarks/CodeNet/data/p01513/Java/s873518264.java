import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int[][] map = new int[n+1][];
			int p;
			for(int i=0;i<=n;i++){
				p = sc.nextInt();
				map[i] = new int[p];
				for(int j=0;j<p;j++) map[i][j] = sc.nextInt();
			}
			
			int ans = -1;
			int count = 0;
			for(int i=0;i<n;i++){
				count = 0;
				for(int j=0;j<map[i].length;j++){
					for(int k=0;k<map[n].length;k++){
						if(map[n][k]==map[i][j]){
							count++;
							break;
						}
					}
				}
				if(count==map[n].length){
					if(ans==-1)	ans = i+1;
					else{
						ans = -1;
						break;
					}
				}
			}
			System.out.println(ans);
		}	
	}	
}