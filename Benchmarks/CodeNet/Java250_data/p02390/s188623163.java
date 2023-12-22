import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String buf = br.readLine();
			int a = Integer.parseInt(buf);
			
			if(0 <= a || a < 86400){
				int hour = a /3600;
				int min = (a% 3600) / 60;
				int sec = (a% 3600) % 60;
				
			System.out.println(hour+":" + min + ":" + sec);
			}
		} catch(IOException e) {
			System.err.println(e);
		}
	}

}