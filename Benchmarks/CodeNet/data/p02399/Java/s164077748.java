import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String datas = br.readLine();
		String[] data = datas.split(" ");
		float a = Integer.parseInt(data[0]);
		float b = Integer.parseInt(data[1]);
		
		int d = (int)a / (int)b ;
		int r = (int)a % (int)b ;
		float f = a / b ;
		
		System.out.println(d + " " + r + " " + f);
	}
}