import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new  BufferedReader(new InputStreamReader(System.in));
		String[] str = buf.readLine().split(" ");
		int r = Integer.parseInt(str[0]);
		int c = Integer.parseInt(str[1]);
		int[][] array = new int[r+1][c+1];
		
		for(int i=0; i<r; i++){
			str = buf.readLine().split(" ");
			for(int j=0; j<c; j++){
				array[i][j] = Integer.parseInt(str[j]);
			}
		}
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				array[i][c] += array[i][j];
			}
		}
		for(int j=0; j<=c; j++){
			for(int i=0; i<r; i++){
				array[r][j] += array[i][j];
			}
		}
		for(int i=0; i<r+1; i++){
			for(int j=0; j<c+1; j++){
				System.out.print(array[i][j]);
				if(j!=c)
					System.out.print(" ");
			}
			System.out.println();
		}		
	}
}