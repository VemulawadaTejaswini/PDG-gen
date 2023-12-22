import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[]args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		double r=Double.parseDouble(str);
		double pi=3.141592653589;
		double are = r*r*pi;
		double circ = 2*r*pi;
		System.out.printf("%.8f %.8f%n",are,circ);
	}
}