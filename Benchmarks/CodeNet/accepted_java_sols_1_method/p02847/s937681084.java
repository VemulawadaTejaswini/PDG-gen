import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int out =0;
		if(str.equals("SUN")) {
			out = 7;
		}else if(str.equals("MON")) {
			out = 6;
		}else if(str.equals("TUE")) {
			out = 5;
		}else if(str.equals("WED")) {
			out = 4;
		}else if(str.equals("THU")) {
			out = 3;
		}else if(str.equals("FRI")) {
			out = 2;
		}else if(str.equals("SAT")) {
			out = 1;
			
		}
		System.out.println(out);
	}

}
