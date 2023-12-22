import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for (int i = 1; ; i++) {
			String s=br.readLine();
			if(s.equals("0"))
				break;
			System.out.println("Case "+i+": "+s);
		}

	}

}