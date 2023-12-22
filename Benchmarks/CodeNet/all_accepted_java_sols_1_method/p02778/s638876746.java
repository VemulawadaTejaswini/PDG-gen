import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		br.close();
		StringBuffer sb = new StringBuffer();
		int len = s.length();
		for(int i = 0;i<len;i++) {
			sb.append('x');
		}
		System.out.println(sb.toString());
	}

}
