import java.io.*;

class Main{
	
	public static void main(String args[]) throws IOException{
		String cards;
		
		int m,h;
		
		BufferedReader br 
			= new BufferedReader(new InputStreamReader(System.in));
		while(true){
			cards = br.readLine();
			
			if(cards.equals("-"))break;
			
			m = Integer.parseInt(br.readLine());
			
			for(int i=0;i<m;i++){
				h = Integer.parseInt(br.readLine());
				
				cards = cards.substring(h,cards.length()) + cards.substring(0,h);
			}
			
			System.out.println(cards);
		}
	}
}