import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		String string;
		int x, y, tmp, count;
		
		while(!(string = reader.readLine()).equals("0 0")){
			x = Integer.valueOf(string.split(" ")[0]);
			y = Integer.valueOf(string.split(" ")[1]);
			count = 0;
			
			if(x > y){
				tmp = y;
				y = x;
				x = tmp;
			}
			while(y != 0){
				tmp = x;
				x = y;
				y = tmp;
				x = app.CommonDivisor(x, y);
				count++;
			}
			System.out.println(x + " " + (count - 1));
		}
	}
	
	public int CommonDivisor(int x, int y){
		if(y == 0) return x;
		return x % y;
	}
}