import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmpArray = br.readLine().split(" ");
		int x = Integer.parseInt(tmpArray[0]);
		//int y = Integer.parseInt(tmpArray[1]);
		int h = x/3600;
		int m = (x%3600)/60;
		int s = x%60;
		System.out.println(h+":"+m+":"+s);
	}

}