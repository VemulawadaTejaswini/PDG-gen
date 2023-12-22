import java.io.*;
public class Main {
		public static void main(String[] arg) throws IOException {
			InputStreamReader is = new InputStreamReader(System.in); 
	        BufferedReader br = new BufferedReader(is);
			String str = br.readLine();
			String[] spl = str.split(" ");
			if(Integer.parseInt(spl[0]) < Integer.parseInt(spl[1]) && Integer.parseInt(spl[1]) < Integer.parseInt(spl[2])){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
	}

}