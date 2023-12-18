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
		
		while((line = in.readLine()) != null){
			String[] tmp = line.split(" ");
			String name = tmp[0];
			int am = Integer.parseInt(tmp[1]);
			int pm = Integer.parseInt(tmp[2]);
			
			System.out.printf("%s %d %d\n", name, am+pm, am*200+pm*300);
		}
	}
}