import java.io.*;
public class Main {
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String[] str = br.readLine().split(" ");
			int H = Integer.parseInt(str[0]);
			int W = Integer.parseInt(str[1]);
			//System.out.print("\n");
			if(H==0 && W==0)break;
			//System.out.print("\n");
			
			for(int j=0; j<H; j++){
			
				for(int i=0; i<W; i++){
					System.out.print("#");
				}
					System.out.print("\n");
			}
			System.out.print("\n");
		}
	}

}