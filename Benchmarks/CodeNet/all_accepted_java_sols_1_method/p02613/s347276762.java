import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int ac = 0, wa = 0, tle = 0, re = 0;
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			
			if(str.equals("AC"))
				ac++;
			else if(str.equals("WA"))
				wa++;
			else if(str.equals("TLE"))
				tle++;
			else if(str.equals("RE"))
				re++;
		}
		
		System.out.println("AC x "+ ac);
		System.out.println("WA x "+ wa);
		System.out.println("TLE x "+ tle);
		System.out.println("RE x "+ re);
	}

}