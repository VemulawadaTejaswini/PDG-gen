import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String[] strarray = br.readLine().split(" ");
			int n = Integer.parseInt(strarray[0]);
			int m = Integer.parseInt(strarray[1]);

			if(n == 0 && m == 0){
				break;
			}
			
			int current = n - 1;
			
			boolean[] available = new boolean[n];
			Arrays.fill(available, true);
			
			int turn = 0;
			while(turn < n){
				
				int send = 0;
				while(true){
					current = (current + 1)%n;
					if(available[current]){
						send++;
						if(send == m){
							//System.out.println("now "+current);
							available[current] = false;
							turn++;
							break;
						}
					}

				}
			}
			
			System.out.println(current + 1);
		}
	}

}