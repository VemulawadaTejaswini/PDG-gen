import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true){
			String line = input.readLine();
			String[] num = line.split(" ");
			int n = Integer.parseInt(num[0]);
			int x = Integer.parseInt(num[1]);
			int sum = 0;
			if(n == 0 && x == 0) break;
			for(int i = 1 ; i <= (n-2) ; i ++){
				for(int j = i+1 ; j <= (n-1) ; j++){
					for(int k = j+1 ; k <= n ; k++){
						if(i+j+k==x) {
							sum++;
						}
					}
				}
			}
			sb.append(sum +"\n");
		}
		System.out.print(sb);
	}
}