import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String datas = br.readLine();
		String[] data = datas.split(" ");
		int a = Integer.parseInt(data[0]);
		int b = Integer.parseInt(data[1]);
		
		int d = a / b ;
		int r = a % b ;
		double f = (double)a / (double)b ;
		
		System.out.printf(d + " " + r + " " +"%f",(double)f);
	}
}