import java.io.*;
 
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] rc = line.split(" ");
        int r = Integer.parseInt(rc[0]);
        int c = Integer.parseInt(rc[1]);
        int[][] matrix = new int[r+1][c+1];	//????¨???§?????\??????
        int[] s = new int[c+1];
        for(int i=0; i<r; i++) {
            line = br.readLine();
            String[] inputs = line.split(" ");
            matrix[i][c] = 0;				//????¨?
            for(int j=0; j<c; j++) {
                matrix[i][j] = Integer.parseInt(inputs[j]);
                matrix[i][c] += matrix[i][j];
            }
        }
        for(int i=0; i <= c; i++) {	//????¨????????¨?????¨??????????
			matrix[r][i] = 0;
			for( int j = 0 ; j < r ; j++ ) {
				matrix[r][i] += matrix[j][i];
			}
        }
        for(int i = 0 ; i <= r ; i++ ) {
			for( int j = 0 ; j <= c ; j++ ) {
				System.out.print( matrix[i][j]) ;
				if ( j < c ) {
					System.out.print( " " ) ;
				}
			}
			System.out.println("");
		}
    }
}