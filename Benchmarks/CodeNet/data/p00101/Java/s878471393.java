import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String number = br.readLine();
		int n = Integer.parseInt(number);
		
		for(int i=0; i<n; i++){
			 String str = br.readLine();
		     str = str.replaceAll("Hoshino","Hoshina");
		     System.out.println(str);
		}
	}
}