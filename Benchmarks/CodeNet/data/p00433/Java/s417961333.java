import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args){
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int[] x = new int[2];
		
		try{
		for(int i = 0; i < 2; i++)
			for(int j = 0; j < 4; j++)
				x[i] += Integer.parseInt(reader.readLine());
		
		System.out.println(Math.max(x[0], x[1]));
		
		reader.close();
		}catch(IOException e){
		}
	}
}