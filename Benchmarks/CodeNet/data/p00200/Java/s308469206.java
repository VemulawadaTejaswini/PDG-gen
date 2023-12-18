import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt(), m = in.nextInt();
			if(n==0 && m==0) return ;
			int money[][] = new int[m][m], time[][] = new int[m][m];
			for(int i=0; i<m; i++)
				for(int j=0; j<m; j++)
					money[i][j] = time[i][j] = 1<<29;
			for(int i=0; i<n; i++){
				int a = in.nextInt()-1, b = in.nextInt()-1;
				money[a][b] = money[b][a] = in.nextInt();
				time[a][b] = time[b][a] = in.nextInt();
			}
			for(int k=0; k<m; k++)
				for(int i=0; i<m; i++)
					for(int j=0; j<m; j++){
						money[i][j] = Math.min(money[i][j], money[i][k] + money[k][j]);
						time[i][j] = Math.min(time[i][j], time[i][k] + time[k][j]);
					}
			int k = in.nextInt();
			for(int i=0; i<k; i++){
				int a = in.nextInt()-1, b = in.nextInt()-1, cmd = in.nextInt();
				if(cmd==0) System.out.println(money[a][b]);
				else System.out.println(time[a][b]);
			}
		}
	}
}