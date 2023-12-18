import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));

			String str = reader.readLine();
			int c1 = Integer.parseInt(str.split(" ",0)[0]);
			int c2 = Integer.parseInt(str.split(" ",0)[1]) * 5;
			int c3 = Integer.parseInt(str.split(" ",0)[2]) * 10;
			int c4 = Integer.parseInt(str.split(" ",0)[3]) * 50;
			int c5 = Integer.parseInt(str.split(" ",0)[4]) * 100;
			int c6 = Integer.parseInt(str.split(" ",0)[5]) * 500;
			int c = c1 + c2 + c3 + c4 + c5 + c6;
			
			if(c > 1000)
				System.out.println(1);
			else
				System.out.println(0);
			
			reader.close();
	}
}