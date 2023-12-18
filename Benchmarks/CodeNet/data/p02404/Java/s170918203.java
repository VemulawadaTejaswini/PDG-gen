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
			for(int i=1; i<=W; i++){
				for(int j=1; j<=H; j++){
					if(i==1 || j==1 || i==W || j==H )
						System.out.print("#");
					else
						System.out.print(".");
				}
				System.out.println();
			}
		}		
	}
}