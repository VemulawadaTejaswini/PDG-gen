import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int n, old;
		
		while(!(string = reader.readLine()).equals("0")){
			n = Integer.parseInt(string);
			
			int[] age = new int[7];
			for(int i = 0; i < n; i++){
				old = Integer.parseInt(reader.readLine());
				if(old < 10) age[0]++;
				if(10 <= old && old < 20) age[1]++;
				if(20 <= old && old < 30) age[2]++;
				if(30 <= old && old < 40) age[3]++;
				if(40 <= old && old < 50) age[4]++;
				if(50 <= old && old < 60) age[5]++;
				if(60 <= old) age[6]++;
			}
			for(int var : age)System.out.println(var);
		}
		reader.close();
	}
}