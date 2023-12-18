import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		String[] input = br.readLine().split(" ");
		int r = Integer.parseInt(input[0]);
		int c = Integer.parseInt(input[1]);
		int i = 0;
		int j = 0;
		int a = 0;
		int b = 0;
		int matrix[][] = new int[r][c];

		for( i=0 ; i<r ; i++ ){
			input = br.readLine().split(" ");
			for( j=0 ; j<c ; j++ ){
				matrix[i][j] = Integer.parseInt(input[j]);
			}
		}

		for( i=0 ; i<r ; i++){
			for( j=0 ; j<c ; j++ ){
				a = matrix[i][j] + a;
				sb.append(Integer.toString(matrix[i][j])).append(" ");
			}
			sb.append(Integer.toString(a)).append("\n");
			a = 0;
		}

		for( i=0 ; i<c ; i++ ){
			for( j=0 ; j<r ; j++ ){
				a = a + matrix[j][i];
			}
			sb.append(Integer.toString(a)).append(" ");
			b = b + a;
			a = 0;
		}

		sb.append(Integer.toString(b)).append("\n");
		System.out.print(sb);
	}
}