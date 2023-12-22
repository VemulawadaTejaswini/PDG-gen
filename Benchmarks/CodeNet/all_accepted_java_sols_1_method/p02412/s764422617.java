import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args)throws IOException{
		int count;
		int add=0;
		int ave3,ave2;
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String line = br.readLine();
			String[] str = line.split(" ");
			int n = Integer.parseInt(str[0]);
			int x = Integer.parseInt(str[1]);
			
			if((n == 0) && (x == 0)){
				break;
			}
			
			count = 0;
			ave3 = x / 3;
			for(int i=1; i<ave3; i++){
				ave2 = (x - i) / 2;
				for(int j=i+1; j<=ave2; j++){
					int k = x - i - j;
					if((j < k) && (k <= n)){
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}