import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String[] str = buf.readLine().split(" ");
			int H = Integer.parseInt(str[0]);
			int W = Integer.parseInt(str[1]);
			if(H==0 && W==0)
				break;
			for(int i=1; i<=H; i++){
				for(int j=1; j<=W; j++){
					System.out.print("#");
				}
				System.out.println();
			}
                  System.out.println();
      
		}
	}	
}