import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int n, m, max, conflict, array[];
		
		while(!(string = reader.readLine()).equals("0 0")){
			n = Integer.valueOf(string.split(" ")[0]);
			m = Integer.valueOf(string.split(" ")[1]);
			
			array = new int[n];
			for(int i = 0; i < n; i++) array[i] = Integer.valueOf(reader.readLine());
			
			max = 0;
			for(int i = 0; i < m; i++) max += array[i];
			
			conflict = max;
			for(int i = 0; i < n - m - 1; i++){
				conflict += array[i + m] - array[i];
				if(max < conflict) max = conflict;
			}
			
			System.out.println(max);
		}
		reader.readLine();
	}
}