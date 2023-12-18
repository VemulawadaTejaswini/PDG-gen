import java.util.LinkedList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			int m = in.nextInt();
			int s = in.nextInt()-1;
			int g1 = in.nextInt()-1;
			int g2 = in.nextInt()-1;
			if(n == 0) break;
			int[][] edge = new int[n][n];
//			int[][] root = new int[n][n];
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
//					root[i][j] = i;
					if(i==j) continue;
					edge[i][j] = Integer.MAX_VALUE/2;
				}
			}
			for(int i=0; i<m; i++){
				int b1 = in.nextInt()-1;
				int b2 = in.nextInt()-1;
				int c = in.nextInt();
				edge[b1][b2] = c;
			}
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					for(int k=0; k<n; k++){
						if(edge[j][k] > edge[j][i]+edge[i][k]){
							edge[j][k] = edge[j][i] + edge[i][k];
//							root[j][k] = i;
						}
					}
				}
			}
			int res = edge[s][g1] + edge[s][g2];
			for(int i=0; i<n; i++){
				res = Math.min(res, edge[s][i]+edge[i][g1]+edge[i][g2]);
			}
//			LinkedList<Integer> list = rooting(root, s, g1);
//			for(int i: list){
//				res = Math.min(res, edge[s][g1] + edge[i][g2]);
//			}
			
//			list = rooting(root, s, g2);
//			for(int i: list){
//				res = Math.min(res, edge[s][g2] + edge[i][g1]);
//			}
			
			System.out.println(res);
		}
	}
	
	public static LinkedList<Integer> rooting(
			int[][] root, int s, int t){
		LinkedList<Integer> res = new LinkedList<Integer>();
		refound(root, s, t, res);
		return res;
	}
	
	public static void refound(
			int[][] root, int s, int t
			, LinkedList<Integer> res){
		int center = root[s][t];
		if(s == center){
			res.add(t);
			return;
		}
		refound(root, s, center, res);
		refound(root, center, t, res);
	}
}