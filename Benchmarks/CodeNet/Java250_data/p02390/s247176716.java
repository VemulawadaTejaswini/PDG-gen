
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
		int second = Integer.parseInt(br.readLine());
		int hour = second/3600;
		second = second - hour * 3600;
		int minute = second/60;
		second = second - minute*60;
		System.out.println(hour+":"+minute+":"+second);
	}

}