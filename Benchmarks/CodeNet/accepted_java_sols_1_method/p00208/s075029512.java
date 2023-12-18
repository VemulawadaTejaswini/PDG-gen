
import java.io.*;

public class Main {

	//ツ　0208 Room Numbers of a Hospital
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String data = "1\n"+
//		BufferedReader reader = new BufferedReader(new StringReader(data));

		for(int loop = 0;;loop++) {
			
			String s = reader.readLine();
			int old = Integer.parseInt(s);
			if (old == 0)
				break;
			String oct = Integer.toOctalString(old);
			oct = oct.replace('7', '9');
			oct = oct.replace('6', '8');
			oct = oct.replace('5', '7');
			oct = oct.replace('4', '5');
			System.out.printf("%s\n", oct);
		}
		
		reader.close();
	}
}