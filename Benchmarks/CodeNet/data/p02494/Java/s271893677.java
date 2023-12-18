import java.io.*;
public class Main {

	static InputStreamReader ir = new InputStreamReader(System.in);
	static BufferedReader br = new BufferedReader(ir);

	public static void main(String[] args) throws IOException{
		int H,W;
		while(true){
			String s = br.readLine();
			String[] st = s.split(" ");

			H = Integer.parseInt(st[0]);
			W = Integer.parseInt(st[1]);
			if(H==0 && W ==0) break;
			for(int i=0;i<H;i++){
				for(int j=0; j<W; j++){
					System.out.print("#");
				}
				System.out.println();
			}
		}

	}

}