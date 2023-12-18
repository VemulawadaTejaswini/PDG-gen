import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] a) throws java.lang.Exception {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	
		String buf = br.readLine();
	
		int num = Integer.parseInt(buf);

		System.out.println(num*num*num);
	}
}