import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while(true){

			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input, " ");
			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int count = 0;

			if(n == 0 && x == 0){
				break;
			}

			for(int i = 1; i <= n; i++){
				for(int j = 1; j <= n; j++){

					if(j == i){
						break;
					}

					for(int k = 1; k <= n; k++){

						if(k == i || k == j){
							break;
						}

						if((i + j + k) == x){
							count++;
						}

					}

				}
			}

			sb.append(count + "\n");

		}

		System.out.print(sb);

	}
}