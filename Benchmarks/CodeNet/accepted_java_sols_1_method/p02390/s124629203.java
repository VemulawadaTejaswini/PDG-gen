import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String str = br.readLine();
		
		int S = Integer.parseInt(str);
		
		int h,m,s;
		
		h=S/(3600);
		m=(S/60)-(h*60);
		s=S-((h*3600)+(m*60));
					
		System.out.println(h+":"+m+":"+s);
	}
		
}