import java.io.*;

class Main{
	
	public static void main(String args[]) throws IOException{
		BufferedReader br 
			= new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int i=1;
		int x;
		while(true){
			x = i;
			
			if(x%3==0){
				System.out.print(" "+i);
			} else {
			
				while(x != 0){
					if(x%10==3){
						System.out.print(" "+i);
						break;
					}
					
					x/=10;
				}
				
			} 
			
			if(++i > n)break;
		}
		
		System.out.print("\n");
	}
	
}