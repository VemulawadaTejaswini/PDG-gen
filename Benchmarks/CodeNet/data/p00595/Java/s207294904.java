import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		
		String x = reader.readLine();
		int a = Integer.parseInt(x.split(" ", 0)[0]);
		int b = Integer.parseInt(x.split(" ", 0)[1]);
		
		while(a != b){
			if(a > b)a = a - b;
			if(b > a)b = b - a;
		}
		System.out.println(a);
		
		reader.close();
	}
}