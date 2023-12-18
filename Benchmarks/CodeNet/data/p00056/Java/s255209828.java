import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args){
		Main myMain = new Main();
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		
		int n,slot,count;
		boolean is = true;
		int[] x = new int[50001];
		
		try{
			while((n = Integer.parseInt(reader.readLine())) != 0){
				slot = count = 0;
				
				for(int i = 2; i < n; i++){
					is = myMain.prime(i,is);
					if(is){
						x[slot++] = i;
					}
					}
				for(int i = 0; i < n / 2; i++){
					for(int j = i; j < n; j++){
						if(x[i] + x[j] == n){
							count++;
						}
					}
				}
				System.out.println(count);	
			}
			reader.close();
		}catch(IOException e){
		}
	}
	public boolean prime(int x, boolean y){
		
		y = true;
		
		for(int i = 2; i <= x / 2; i++){
			if(x % i == 0){
				y = false;
				break;
			}
		}
		return y;
	}
	
}