
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int V = stdIn.nextInt();
		boolean[][] judg = new boolean[V+1][V+1];
		for(int i=0;i<V+1;i++){
			Arrays.fill(judg[i], false);
		}
		for(int i=1;i<V+1;i++){
			int id = stdIn.nextInt();
			int count = stdIn.nextInt();
			for(int j=0;j<count;j++){
				int d = stdIn.nextInt();
				judg[id][d] = true;
			}
		}
		int[] d = new int[V+1];
		for(int i=1;i<V+1;i++){
			for(int j=1;j<V+1;j++){
				if(judg[i][j] && d[j]==0){
					d[j] = d[i] + 1;
				}
			}
		}
		
		for(int i=1;i<V+1;i++){
			System.out.println(i+" "+d[i]);
		}
		
	}
}