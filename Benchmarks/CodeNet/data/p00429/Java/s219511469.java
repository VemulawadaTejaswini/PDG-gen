import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line[] = br.readLine().split(" ");
			int n = Integer.parseInt(line[0]);
			if(n==0){break;}
			String answer = br.readLine().split(" ")[0];

			for(int i=0; i<n; i++){
				String result = "";
				String previous = "";
				int count = 0;

				for(int j=0; j<answer.length(); j++){
					String now = answer.substring(j,j+1);
					if(previous.equals(now)){
						count++;
					}else{
						if(count!=0){result += count + previous;}
						previous = now;
						count = 1;
					}
				}
				result += count + previous;
				answer = result;
			}
			System.out.println(answer);
		}
	}
}