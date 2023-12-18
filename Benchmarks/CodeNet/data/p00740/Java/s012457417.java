import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		String string;
		
		int n, p, stone, now;
		while(true){
			string = reader.readLine();
			n = Integer.valueOf(string.split(" ")[0]);
			stone = p = Integer.valueOf(string.split(" ")[1]);
			if((n | p) == 0) break;
			
			int mayors[] = new int[n];
			now = 0;
			while(true){
				if(stone > 0){
					++mayors[now];
					--stone;
				}else if(stone == 0){
					stone = mayors[now];
					mayors[now] = 0;
				}
				if(stone == 0 && mayors[now] == p){
					break;
				}
				
				now++;
				if(now == n) now = 0;
			}
			System.out.println(now);
		}
		reader.close();
	}
}