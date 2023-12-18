import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] str = buf.readLine().split(" ");
			int H = Integer.parseInt(str[0]);
			int W = Integer.parseInt(str[1]);

			if(W==0 && H==0)
				break;
			for(int i=0; i<H; i++){
				for(int j=0; j<W; j++){
					if(i==0 || j==0 || j==W-1 || i==H-1 )
						System.out.print("#");
					else
						System.out.print(".");
				}
				System.out.println();
			}
			System.out.println();
		}		
	}
}