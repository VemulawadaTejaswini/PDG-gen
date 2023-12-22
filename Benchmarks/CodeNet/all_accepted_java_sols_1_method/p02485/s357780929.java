import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			String s; 
			int count = 0, i = 0;
			s = br.readLine();
			while(!s.equals("0")) {
				while(i < s.length()) {
					count += s.charAt(i++)-'0';
				}
				System.out.println(count);
				count = 0;
				i = 0;
				s = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}