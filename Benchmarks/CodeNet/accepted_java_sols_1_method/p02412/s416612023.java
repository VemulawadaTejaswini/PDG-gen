import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] line = br.readLine().split(" ");
			int n = Integer.parseInt(line[0]);
			int x = Integer.parseInt(line[1]);
			int sun = 0;
			if( n == 0 && x == 0) break;
			for(int i = 1; i <= n ; i++){
				for(int j = 1; j <=i ; j++){
					for(int k = 1; k <=j ; k++){
						if( i+j+k == x && i != j && i != k && j != k ){
							sun++;
						}
					}
				}
			}
			System.out.println(sun);
		}
	}
}