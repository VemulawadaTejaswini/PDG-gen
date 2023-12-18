import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	static int count;
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			int s;
			while((s = Integer.parseInt(br.readLine()))!=0) {
			r(s);
			System.out.println(count);
			count = 0;
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	static void r(int s) {
		if(s == 0)
			return;
		else
			count += s%10;
		r(s/10);
	}
}