import java.io.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[][] data = new String[8][8];
		for(int y=0; y<8; y++){
			line = in.readLine();
			for(int x=0; x<8; x++){
				data[y][x] = line.substring(x, x+1);
			}
		}
		
		System.out.println(90);
		for(int x=0; x<8; x++){
			for(int y=0; y<8; y++){
				System.out.print(data[7-y][x]);
			}
			System.out.println();
		}
		
		System.out.println(180);
		for(int y=0; y<8; y++){
			for(int x=0; x<8; x++){
				System.out.print(data[7-y][7-x]);
			}
			System.out.println();
		}
		
		System.out.println(270);
		for(int x=0; x<8; x++){
			for(int y=0; y<8; y++){
				System.out.print(data[y][7-x]);
			}
			System.out.println();
		}
	}
}