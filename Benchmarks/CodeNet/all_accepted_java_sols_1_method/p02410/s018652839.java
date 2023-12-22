import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		String[] Ginput = br.readLine().split(" ");
		int n = Integer.parseInt(Ginput[0]);
		int m = Integer.parseInt(Ginput[1]);
		int i = 0;
		int j = 0;
		int matrix[][] = new int[n][m];
		int mul[] = new int[m];
		int ans[] = new int[n];

		for( i=0 ; i<n ; i++ ){
			String[] input = br.readLine().split(" ");
			for( j=0 ; j<m ; j++ ){
				matrix[i][j]=Integer.parseInt(input[j]);
			}
		}

		for( i=0 ; i<m ; i++ ){
			mul[i] = Integer.parseInt(br.readLine());
		}

		for( i=0 ; i<n ; i++ ){
			for( j=0 ; j<m ; j++ ){
				int k = matrix[i][j] * mul[j];
				ans[i] = ans[i] + k;
			}
			sb.append(Integer.toString(ans[i])).append("\n");
		}

		System.out.print(sb);
	}
}