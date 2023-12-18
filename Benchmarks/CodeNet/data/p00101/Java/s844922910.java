import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String number = br.readLine();
		int n = Integer.parseInt(number);
		
		for(int i=0; i<n; i++){
			String str = br.readLine();
			String[] output = str.split(" ", 0);
			int j=0;
			if((output.length)-1 == 0){
				if(output[0].equals("Hoshino")){
					System.out.println("Hoshina");
				}
				else{
					System.out.println(output[0]); 
				}	
			}
			else{
				for(j=0; j<(output.length)-1 ;j++){		
					if(output[j].equals("Hoshino")){
						System.out.print("Hoshina" + " ");
					}
					else{
						System.out.print(output[j] + " "); 
					}	
				}
				if(output[(output.length)-1].equals("Hoshino")){
					System.out.println("Hoshina");
				}
				else{
					System.out.println(output[(output.length)-1]); 
				}
			}
			
		}	
	}
}