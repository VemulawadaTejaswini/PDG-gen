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
			int n = Integer.parseInt(line);
			if(n==0) break;
			
			int c=0;
			while(n!=1){
				if(n%2==0){
					n = n/2;
				}
				else{
					n = n*3 + 1;
				}
				c++;
			}
			System.out.println(c);
		}
	}
}