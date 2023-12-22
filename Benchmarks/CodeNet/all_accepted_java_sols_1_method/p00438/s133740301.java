import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		while(a!=0){
			int n = sc.nextInt();
			int[][] its = new int[a][b];
			int[] cx = new int[n];
			int[] cy = new int[n];
			for(int i=0; i<n; i++){
				cx[i] = sc.nextInt() - 1;
				cy[i] = sc.nextInt() - 1;
				its[cx[i]][cy[i]] = -1;
			}
			its[0][0] = 1;
			int flag = 0;
			for(int i=1; i<a; i++){
				if(flag==0 && its[i][0]==0){
					its[i][0] = its[i-1][0];
				}
				else{
					flag -= 1;
				}
			}
			flag = 0; 
			for(int i=1; i<b; i++){
				if(flag==0 && its[0][i]==0){
					its[0][i] = its[0][i-1];
				}
				else{
					flag -= 1;
				}
			}
			for(int i=1; i<a; i++){
				for(int j=1; j<b; j++){
					if(its[i][j]==0){
						if(its[i-1][j]>=0 && its[i][j-1]>=0){
							its[i][j] = its[i-1][j] + its[i][j-1];
						}
						else{
							its[i][j] = Math.max(its[i-1][j]+its[i][j-1]+1, 0);
						}
					}
				}
			}
			System.out.println(its[a-1][b-1]);
			a = sc.nextInt();
			b = sc.nextInt();
		}
	}
}
