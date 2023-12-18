/* Hamming Number */
import java.io.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while((line = in.readLine()) != null){
			String[] tmp = line.split(" ");
			int m = Integer.parseInt(tmp[0]);
			if(m==0) break;
			int n = Integer.parseInt(tmp[1]);
			
			int c = 0;
			for(int i=m; i<=n; i++){
				if(is_hamming(i)){
					c++;
				}
			}
			System.out.println(c);
		}
	}
	
	public boolean is_hamming(int n){
		while(n%2==0){
			n = n/2;
		}
		
		while(n%3==0){
			n = n/3;
		}
		
		while(n%5==0){
			n = n/5;
		}
		
		if(n==0) return false;
		if(n==1) return true;
		
		return false;
	}
}