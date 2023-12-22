import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		String s,t;
		int length;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = br.readLine();
		t = br.readLine();

		length = s.length();

		if(s.equals(t)) {
			System.out.println("Yes");
			return;
		}

		for(int i=0;i<length;i++){
		char s_part = s.charAt(length-1);
		s = s.substring(0, length-1);
		s = s_part + s;
		if(s.equals(t)) {
			System.out.println("Yes");
			return;
		}
		}
		System.out.println("No");
	}

}
