import java.io.*;
import java.lang.Integer;
import static java.lang.Math.*;
public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String in  = br.readLine() ;
			double r = Double.parseDouble(in);
			double area = r*r*PI;
			double enshu = 2*r*PI;
			System.out.printf("%5.5f %5.5f", area, enshu );
		} catch ( IOException e ) {
			System.out.println("??¨??????????????????????????????");
		}
	}
}