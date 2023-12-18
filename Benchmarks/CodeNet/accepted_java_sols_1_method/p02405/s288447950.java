import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		
		while(true){
			//int count= 0;
			
			String[] str = br.readLine().split(" ");
			int H = Integer.parseInt(str[0]);
			int W = Integer.parseInt(str[1]);
			if(H==0 && W==0) break;
			
			
			//if(H%2 == 0){
				for(int i=0; i<H; i++){
					for(int j=0; j<W; j++){
						if((j+i)%2 == 0){
							System.out.print("#");
						}else {
							System.out.print(".");
						}
						
					}
					System.out.print("\n");
			
				}
				System.out.print("\n");
			
					
		}
		
	}
}