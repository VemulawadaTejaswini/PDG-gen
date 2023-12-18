import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		String string;
		
		int n, r, p, c;
		while(true){
			string = reader.readLine();
			n = Integer.valueOf(string.split(" ")[0]);
			r = Integer.valueOf(string.split(" ")[1]);
			if((n | r) == 0) break;
			
			int card[] = new int[n];
			for(int i = 0; i < n; i++) card[i] = n - i;
			
			for(int i = 0; i < r; i++){
				string = reader.readLine();
				p = Integer.valueOf(string.split(" ")[0]) - 1;
				c = Integer.valueOf(string.split(" ")[1]);
				
				card = app.shuffle(card, p, c);
			}
			System.out.println(card[0]);
		}
		reader.close();
	}
	
	public int[] shuffle(int card[], int p, int c){
		int n = card.length;
		int res[] = new int[n];
		
		for(int i = 0; i < c; i++){
			res[i] = card[p + i];
		}
		for(int i = 0; i < p; i++){
			res[c + i] = card[i];
		}
		for(int i = p + c; i < n; i++){
			res[i] = card[i];
		}
		
		return res;
	}
}