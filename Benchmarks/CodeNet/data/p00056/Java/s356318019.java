import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args){
		Main myMain = new Main();
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		
		int n,slot,count;
		boolean is;
		
		try{
			while((n = Integer.parseInt(reader.readLine())) != 0){
				int[] x = new int[n];
				slot = count = 0;
				
				for(int i = 2; i < n; i++){
					is = true;
					is = myMain.prime(i,is);
					if(is){
						x[slot] = i;
						slot++;
					}
				}
				for(int i = 0; i < x.length; i++){
					for(int j = i; j < x.length; j++){
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
		
		for(int i = 2; i <= Math.sqrt(x); i++){
			if(x % i == 0){
				y = false;
				break;
			}
		}
		return y;
	}
	
}