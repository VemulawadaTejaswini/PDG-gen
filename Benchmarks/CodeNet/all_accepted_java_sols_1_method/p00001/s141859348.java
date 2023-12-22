//List of Top 3 Hills
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

//		 int n = Integer.parseInt(in.readLine());
		
		
		int top=0;
		int second=0;
		int third=0;
		
		int n;
		for(int i=0;i<10;i++){
			
			n = Integer.parseInt(in.readLine());
			
			if(n>third){
				third=n;
			
				if(n>second){
					third=second;
					second=n;
					
					if(n>top){
						second=top;
						top=n;
					}
				}
			}

			
		}
		
		
		System.out.println(top);
		System.out.println(second);
		System.out.println(third);
		
	}
}