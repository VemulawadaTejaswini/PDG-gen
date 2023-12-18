import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException{
		String str;
		int i,d;
		int total = 0;
		int x;
		
		BufferedReader input =
				new BufferedReader(new InputStreamReader(System.in));
		while((str = input.readLine()) != null){
			d = Integer.parseInt(str);
			x = 0; //図形に書き出すと四角形は600/d - 1個
			for(i = 0; i < 600/d; i++){
				total += x * x * d;
				x += d;
			}
			System.out.println(total);
			//x = 0;
			total = 0;
		}
	}
}