import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		
		int n,k,max,sum;
		while(!(string = reader.readLine()).equals("0 0")){
			n = Integer.parseInt(string.split(" ")[0]);
			k = Integer.parseInt(string.split(" ")[1]);
			
			int[] num = new int[n];
			for(int i = 0; i < n; i++){
				num[i] = Integer.parseInt(reader.readLine());
			}
			
			max = 0;
			for(int i = 0; i < n - k; i++){
				sum = 0;
				for(int j = i; j < i + 3; j++){
					sum += num[j];
				}
				if(sum > max) max = sum;
			}
			System.out.println(max);
		}
		reader.close();
	}
}