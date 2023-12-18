import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String str;
		
		int n, sum = 0, count;
		while(!(str = reader.readLine()).equals("0")){
			n = Integer.valueOf(str);
			
			count = 0;
			for(int i = 1; i <= n ; i++){
				for(int j = i; j <= n ; j++){
					sum += j;
					if(sum == n && i != j){
						count++;
					}
					if(sum >= n){
						break;
					}
				}
				sum = 0;
			}
			System.out.println(count);
		}
		reader.close();
	}
}