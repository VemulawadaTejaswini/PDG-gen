import java.io.*;
 
public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		new Main();
	}
	public Main() throws IOException {
		new aoj101().doIt();
	}
	class aoj101{
		void doIt() throws IOException {
	        String number = br.readLine();
	        int n = Integer.parseInt(number);
	         
	        for(int i=0; i<n; i++){
	             String str = br.readLine();
	             str = str.replaceAll("Hoshino","Hoshina");
	             System.out.println(str);
	        }
	    }
	}
}