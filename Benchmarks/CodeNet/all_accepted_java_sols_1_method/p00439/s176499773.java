import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int n, m, max, hoge, array[];
		
		while(!(string = reader.readLine()).equals("0 0")){
			n = Integer.valueOf(string.split(" ")[0]);
			m = Integer.valueOf(string.split(" ")[1]);
			
			array = new int[n];
			for(int i = 0; i < n; i++) array[i] = Integer.valueOf(reader.readLine());
			
			max = 0;
			for(int i = 0; i < n - m + 1; i++){
				hoge = 0;
				for(int j = i; j < i + m; j++) hoge += array[j];
				if(hoge > max) max = hoge;
			}
			
			System.out.println(max);
		}
		
		reader.readLine();
	}
}