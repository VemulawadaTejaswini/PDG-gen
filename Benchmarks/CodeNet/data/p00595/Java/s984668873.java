import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(reader.readLine());
		int b = Integer.parseInt(reader.readLine());
		
		while(a != b){
			if(a > b)a = a - b;
			if(b > a)b = b - a;
		}
		System.out.println(a);
		
		reader.close();
	}
}