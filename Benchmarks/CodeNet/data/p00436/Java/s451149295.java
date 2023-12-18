import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static int card[];
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		
		int n = Integer.valueOf(reader.readLine());
		int m = Integer.valueOf(reader.readLine());
		
		card = new int[2 * n];
		for(int i = 0; i < 2 * n; i++) card[i] = i + 1;
		for(int i = 0; i < m; i++) card = app.shuffle(Integer.valueOf(reader.readLine()));
		for(int var : card) System.out.println(var);
		
		reader.close();
	}
	
	public int[] shuffle(int k){
		int res[] = new int[card.length];
		if(k == 0){
			for(int i = 0; i < card.length / 2; i++){
				res[2 * i] = card[i];
				res[2 * i + 1] = card[i + card.length / 2];
			}
		}else{
			for(int i = 0; i < k; i++) res[i] = card[card.length - k + i];
			for(int i = 0; i < card.length - k; i++) res[k + i] = card[i];
		}
		return res;
	}
	
}