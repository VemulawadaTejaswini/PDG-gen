import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n;
			int id = 1;
			
			while(true){
				/* input from here */
				String line = r.readLine();
				n = Integer.parseInt(line);
				if(n==0){
					break;
				}
				/* input till here */
				
				/* output matrix */
				int[][] m = new int[n][n];
				m[0][0] = 1;
				//first row
				for(int column=0;column<n;column++){
					if(column%2==1){
						m[0][column] = m[0][column-1] + 1;
					} else if(column!=0){
						m[0][column] = m[0][column-1] + 2*column;
					}
				}
				//2nd row to 2nd to last row
				for(int row=1;row<n-1;row++){
					//2nth row
					if(row%2==1){
						for(int column=0;column<n-1;column++){
							if(column%2==0){
								m[row][column] = m[row-1][column+1] + 1;
							} else {
								m[row][column] = m[row-1][column+1] - 1;
							}
						}
						if(n%2==0){
							m[row][n-1] = m[row-1][n-1] + (n-row)*2;
						} else {
							m[row][n-1] = m[row-1][n-1] + 1;
						}
					} else {//(2n+1)th row
						for(int column=0;column<n-1;column++){
							if(column%2==0){
								m[row][column] = m[row-1][column+1] - 1;
							} else {
								m[row][column] = m[row-1][column+1] + 1;
							}
						}
						if(n%2==1){
							m[row][n-1] = m[row-1][n-1] + (n-row)*2;
						} else {
							m[row][n-1] = m[row-1][n-1] + 1;
						}
					}
				}
				//final row
				if(n%2==0){
					m[n-1][0] = m[n-2][1] + 1;
					for(int column=1;column<n;column++){
						if(column%2==1){
							m[n-1][column] = m[n-1][column-1] + 1;
						} else if(column!=0){
							m[n-1][column] = m[n-1][column-1] + (n-column)*2;
						}
					}
				} else {
					m[n-1][0] = m[n-2][0] + 1;
					for(int column=1;column<n;column++){
						if(column%2==1){
							m[n-1][column] = m[n-1][column-1] + (n-column)*2;
						} else {
							m[n-1][column] = m[n-1][column-1] + 1;
						}
					}
				}
				
				/* output */
				System.out.println("Case " + id + ":");
				for(int row=0;row<n;row++){
					for(int i=0;i<n;i++){
						System.out.print(String.format("%3d",m[row][i]));
					}
					System.out.println();
				}
				id++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}