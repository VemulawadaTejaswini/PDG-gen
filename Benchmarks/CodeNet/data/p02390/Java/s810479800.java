import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		String inStr;
		inStr = inp();
		String[] in;
		in = inStr.split(" ");

		int t = Integer.valueOf(in[0]);
		int h=t/3600;
		int m=(t%3600)/60;
		int s=t%60;
		
		System.out.println(h+":"+m+":"+s);

	}

	private static String inp() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

}