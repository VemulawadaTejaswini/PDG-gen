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
			int n = Integer.parseInt(line);
			int a = n%39;
			if(a==0) System.out.println("3C39");
			else if(a<10) System.out.println("3C0" + Integer.toString(a));
			else System.out.println("3C" + Integer.toString(a));
		}
	}
}