import java.io.*;

public class Main{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
			try {
				String str = br.readLine();
				while(str != null) {
					String[] strSplit = str.split(" ");
					int sum = Integer.parseInt(strSplit[0]) + Integer.parseInt(strSplit[1]);
					System.out.println(String.valueOf(sum).length());
					str = br.readLine();
					
				}
			} catch(IOException e) {
				System.exit(0);
		}
	}
}