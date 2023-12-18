import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		
		boolean prime[] = app.primeSet();
		int n, res;
		while(true){
			if((n = Integer.valueOf(reader.readLine())) == 0) break;
			
			res = 0;
			for(int i = n; i <= 2 * n; i++){
				if(!prime[i]) res++;
			}
			System.out.println(res);
		}
		
		reader.close();
	}
	public boolean[] primeSet(){
		boolean res[] = new boolean[123456 * 2 + 1];
		res[0] = res[1] = true;
		for(int i = 2; i * i < 123457 * 2; i++){
			for(int j = 2; i * j < 123457 * 2; j++){
				res[i * j] = true;
			}
		}
		return res;
	}
}