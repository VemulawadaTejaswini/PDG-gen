import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str =br.readLine();
		String[] stra = str.split(" ");
		
		double a = Double.parseDouble(stra[0]);
		double b = Double.parseDouble(stra[1]);
		double f = a/b;
		double dd = a/b;
		int d = (int) dd;
		double rr = a%b;
		int r = (int) rr;
		System.out.println(d+" "+r+" "+f);
	}

}