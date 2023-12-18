import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		String string;
		
		int pai[], tmp[];
		char data[];
		while((string = reader.readLine()) != null){
			data = string.toCharArray();
			pai = new int[10];
			tmp = new int[10];
			for(int i = 0; i < 13; i++){
				pai[data[i] - '0']++;
			}
			
			ArrayList<Integer> res = new ArrayList<Integer>();
			for(int i = 1; i < 10; i++){
				if(pai[i] < 4){
					pai[i]++;
					for(int j = 0; j < 10; j++) tmp[j] = pai[j];
					if(app.solve(tmp, 1, 0)){
						res.add(i);
					}
					pai[i]--;
				}
			}
			
			if(res.size() == 0) System.out.println(0);
			else{
				for(int i = 0; i < res.size(); i++){
					if(i == res.size() - 1){
						System.out.println(res.get(i));
					}else{
						System.out.print(res.get(i) + " ");
					}
				}
			}
		}
		reader.close();
	}
	
	public boolean solve(int pai[], int n, int f){
		boolean judge = false;
		if(f == 4){
			for(int var : pai){
				if(var == 2) return true;
			}
			return false;
		}
		if(pai[n] >= 3){
			pai[n] -= 3;
			judge = solve(pai, n, f + 1);
			if(judge) return true;
			pai[n] += 3;
		}
		if(n <= 7 && pai[n] >= 1 && pai[n + 1] >= 1 && pai[n + 2] >= 1){
			pai[n]--;
			pai[n + 1]--;
			pai[n + 2]--;
			judge = solve(pai, n, f + 1);
			if(judge) return true;
			pai[n]++;
			pai[n + 1]++;
			pai[n + 2]++;
		}
		if(n < 9) judge = solve(pai, n + 1, f);
		
		return judge;
	}
}