import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) {
		String str;
		double d = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			str = br.readLine();
			d = Double.parseDouble((str));
		} catch(Exception e) {
			
		}
		int i = (int)Math.pow(d, 3.0);
		System.out.println(i);
	}
}