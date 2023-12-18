
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int answer = 0;
		int mawari = 0;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        int a = Integer.parseInt(s);
        String k = buf.readLine();
        int b = Integer.parseInt(k);      
        
        answer = a*b;
        mawari = a+a+b+b;
        System.out.print(answer + " ");
        System.out.print(mawari);
		
	}
}