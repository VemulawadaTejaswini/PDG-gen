import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num = Integer.parseInt(str);

		int h;
		int m;
		int s;

		s = num%60;
		m = num/60%60;
		h = num/60/60;

		System.out.println(h + ":" + m + ":" + s);
	}

}