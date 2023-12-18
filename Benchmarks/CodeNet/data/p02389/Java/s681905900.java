import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(s);
		int answer = a*b;
		int mawari = a+a+b+b;
		System.out.println(answer);
		System.out.println(mawari);
	}
}