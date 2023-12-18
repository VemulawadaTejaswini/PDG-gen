import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		String str, s[];
		
		int a, b, c, max;
		while(!(str = reader.readLine()).equals("0 0 0")){
			s = str.split(" ");
			a = Integer.valueOf(s[0]);
			b = Integer.valueOf(s[1]);
			c = Integer.valueOf(s[2]);
			
			max = -1;
			for(int i = 1; i < c; i++){
				for(int j = 1; j < c; j++){
					if(app.set(i, a) + app.set(j, a) == c){
						max = Math.max(app.set(i, b) + app.set(j, b), max);
					}
				}
			}
			System.out.println(max);
		}
	}
	
	public int set(int p, int x){
		return p * (100 + x) / 100;
	}
}