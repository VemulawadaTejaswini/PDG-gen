import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str=bfr.readLine();
		int a=Integer.parseInt(str);

		if(a/1000==0) {
			System.out.println("ABC");
		}

		else if(a/1000==1) {
			System.out.println("ABD");
		}
	}
}