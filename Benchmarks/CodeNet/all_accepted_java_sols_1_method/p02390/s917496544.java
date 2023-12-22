import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{

		public static void main(String[] args)throws IOException{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String buf = br.readLine();
			int S = Integer.parseInt(buf);
			int h = S / 3600;
			int m = S % 3600 / 60;
			int s = S % 60;
			System.out.println(h + ":" + m + ":" + s);
	}
}