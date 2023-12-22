import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int k = sc.nextInt();
			if(n==0 && k==0)break;
			
			int[][] map = new int[n+1][k];
			
			for(int i=0;i<n+1;i++) for(int j=0;j<k;j++) map[i][j] = sc.nextInt();
			
			int sum = 0;
			boolean flag = true;
			
			for(int i=0;i<k;i++){
				sum = 0;
				for(int j=1;j<n+1;j++) sum += map[j][i];
				if(sum>map[0][i]){
					flag = false;
					break;
				}
			}
			
			if(flag==true) System.out.println("Yes");
			else System.out.println("No");
			
		}
	
	}	
}