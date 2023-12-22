import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str =br.readLine();
		String[] stra = str.split(" ");
		
		int a = Integer.parseInt(stra[0]);
		int b = Integer.parseInt(stra[1]);
		double f= (double)a/b;
		int d = a/b;
		int r = a%b;
		System.out.printf("%d %d %.7f",d,r,f);
	}

}