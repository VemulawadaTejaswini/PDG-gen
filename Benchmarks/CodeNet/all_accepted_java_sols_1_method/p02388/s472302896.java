import java.io.*;
public class Main {
		public static void main(String[] arg) throws IOException {
			InputStreamReader is = new InputStreamReader(System.in);       //?????????
	        BufferedReader br = new BufferedReader(is);
			String str = br.readLine();  
			int num = Integer.parseInt(str);
			System.out.println(num*num*num);
	}

}