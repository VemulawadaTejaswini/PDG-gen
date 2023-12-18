import java.io.*;

class Main {
	public static void main(String[] args){
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String[] line = br.readLine().split(" ");
			
			int H = Integer.parseInt(line[0]);
			int W = Integer.parseInt(line[1]);
			
			for(int a = 1; a <=W; a++){
				for(int i = 1;i <= H;i++){
					System.out.print("#");
				}
				System.out.print("\n");
			}
		} catch(Exception e){
		}
	}
}
			