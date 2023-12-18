import java.util.*;

class Main {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int r = Integer.parseInt(in.next());
		int c = Integer.parseInt(in.next());
		int[][] table = new int[r+1][c+1];

		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				table[i][j] =  Integer.parseInt(in.next());
			}
		}
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				table[i][c] = table[i][c] + table[i][j];
			}
		}

		for(int i=0;i<r;i++){
			for(int j=0;j<c+1;j++){
				table[r][j] = table[r][j] + table[i][j];
			}
		}
		
		
		for(int i=0;i<r+1;i++){
			for(int j=0;j<c+1;j++){
				if(c==j) System.out.println(table[i][j]);
				else  System.out.print(table[i][j]+" ");
			}
		}


	}	
}