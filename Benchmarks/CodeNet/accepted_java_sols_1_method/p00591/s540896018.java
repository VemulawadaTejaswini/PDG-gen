import java.util.*;

class Main {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(;;){
			int n = in.nextInt();
			if(n == 0) return ;
			int mat[][] = new int[n][n];
			int up[][]  = new int[n][n];
			for(int i=0; i<n; i++)
				for(int j=0; j<n; j++)
					mat[i][j] = in.nextInt();
			for(int i=0; i<n; i++){
				Vector<Integer> pos = new Vector<Integer>();
				int mi = 1<<30;
				for(int j=0; j<n; j++){
					if(mat[i][j] == mi){
						pos.add(j);
					}
					else if(mat[i][j] < mi){
						mi = mat[i][j];
						pos.clear();
						pos.add(j);
					}
				}
				Enumeration<Integer> e = pos.elements();
				while(e.hasMoreElements()){
					up[i][e.nextElement().intValue()] += 1;
				}
			}
			for(int j=0; j<n; j++){
				Vector<Integer> pos = new Vector<Integer>();
				int ma = -(1<<30);
				for(int i=0; i<n; i++){
					if(mat[i][j] == ma){
						pos.add(new Integer(i));
					}
					else if(mat[i][j] > ma){
						ma = mat[i][j];
						pos.clear();
						pos.add(new Integer(i));
					}
				}
				Enumeration<Integer> e = pos.elements();
				while(e.hasMoreElements()){
					up[e.nextElement().intValue()][j] += 2;
				}
			}
			int i=0, j=0;
			boolean f=true;
			for(i=0; i<n; i++){
				for(j=0; j<n; j++){
					if(up[i][j] == 3){
						f = false;
						break;
					}
				}
				if(!f) break;
			}
			System.out.println(((i==n) && (j==n))?0:mat[i][j]);
		}
	}
}