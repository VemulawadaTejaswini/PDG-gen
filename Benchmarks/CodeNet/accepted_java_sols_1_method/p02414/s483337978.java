import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		int l = Integer.parseInt(input[2]);
		int i = 0;
		int j = 0;
		long a = 0;

		int nm[][] = new int[n][m];
		int ml[][] = new int[m][l];

		for( i=0 ; i<n ; i++ ){
			input = br.readLine().split(" ");
			for( j=0 ; j<m ; j++ ){
				nm[i][j]=Integer.parseInt(input[j]);
			}
		}

		for ( i=0 ; i<m ; i++ ){
			input = br.readLine().split(" ");
			for( j=0 ; j<l ; j++ ){
				ml[i][j]=Integer.parseInt(input[j]);
			}
		}

		for ( i=0 ; i<n ; i++ ){
			for( j=0 ; j<l ; j++ ){
				for( int k=0 ; k<m ; k++ ){
					 a = a + (nm[i][k] * ml[k][j]);
				}
				sb.append(String.valueOf(a));
				a = 0;
				if( j==l-1 ) break;
				sb.append(" ");
			}
			sb.append("\n");
		}

		System.out.print(sb);

	}
}