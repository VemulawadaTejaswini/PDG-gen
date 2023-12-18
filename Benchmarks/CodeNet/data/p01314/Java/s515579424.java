import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String str;
		
		int n, sum = 0, flag, count;
		while(!(str = reader.readLine()).equals("0")){
			n = Integer.valueOf(str);
			
			if(n % 2 != 0) flag = 1;
			else           flag = 0; 
			
			count = 0;
			for(int i = 1; i <= (n + flag) / 2; i++){
				for(int j = i; j <= n; j++){
					sum += j + 1;
					if(sum > n) break;
					if(sum == n){
						count++;
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