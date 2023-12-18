import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static final int sum = 196665;
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		String string;
		
		int n = Integer.valueOf(reader.readLine()), day;
		for(int i = 0; i < n; i++){
			string = reader.readLine();
			day = app.solve(string.split(" "));
			System.out.println(sum - day);
		}
		reader.close();
	}
	
	public int solve(String str[]){
		int res = 0, y, m, d;
		y = Integer.valueOf(str[0]);
		m = Integer.valueOf(str[1]) - 1;
		d = Integer.valueOf(str[2]) - 1;
		
		for(int i = 1; i <= y; i++){
			if(i % 3 == 0) res += 200;
			else           res += 195;
		}
		if(y % 3 == 0) res += m * 20 - 5;
		else
			for(int i = 1; i <= m; i++){
				if(i % 2 != 0) res += 20;
				else		   res += 19;
			}
		return res + d;
	}
	
}