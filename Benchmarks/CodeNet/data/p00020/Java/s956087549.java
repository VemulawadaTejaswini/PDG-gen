import java.util.*;
import java.io.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	void doIt() { 
		String str;
		try {
			str = in.readLine();
			String str1 = str.toUpperCase();
			System.out.println(str1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}