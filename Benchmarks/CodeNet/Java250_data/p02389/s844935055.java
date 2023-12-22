import java.io.*;
public class Main {
		public static void main(String[] arg) throws IOException {
			InputStreamReader is = new InputStreamReader(System.in); 
	        BufferedReader br = new BufferedReader(is);
			String str = br.readLine();
			String[] spl = str.split(" ", 0);
			System.out.println(Integer.parseInt(spl[0])*Integer.parseInt(spl[1])+" "+(Integer.parseInt(spl[0])*2+Integer.parseInt(spl[1])*2));
	}

}