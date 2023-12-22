
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int steps = Integer.parseInt(br.readLine());
		int cards[][] = new int [steps+1][2*n];
		for (int i=0; i<2*n; i++){
			cards[0][i] = i;
		}
		for (int i=0; i<steps; i++){
			int shuffle = Integer.parseInt(br.readLine());
			if(shuffle == 0){
				for (int j=0; j<n; j++){
					cards[i+1][2*j] = cards[i][j];
					cards[i+1][2*j+1] = cards[i][n+j];
				}
			}else{
				for (int j=0; j<2*n; j++){
					cards[i+1][j] = cards[i][(j+shuffle)%(2*n)];
				}
			}
		}

		for (int i=0; i<2*n; i++){
			System.out.println(cards[steps][i] + 1);
		}
	}
}