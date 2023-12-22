import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for(int i = 1; i <= n; i++){

			int x = i;

			if(x % 3 == 0){
				sb.append(" " + i);
			}else{
				while(x != 0){
					if(x % 10 == 3){
						sb.append(" " + i);
						break;
					}else{
						x /= 10;
					}
				}
			}
		}

		System.out.println(sb);


	}
}