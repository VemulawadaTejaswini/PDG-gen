import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String buf = br.readLine();
            x = Integer.parseInt(buf);
		} catch(Exception e) {
            x = 0;
		}
		int x3 = x*x*x;
		System.out.println(x3);
	}

}