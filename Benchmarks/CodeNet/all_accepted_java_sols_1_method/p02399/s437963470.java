import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String [] string = bufferedReader.readLine().split(" ");
		
		Integer a = Integer.parseInt(string[0]);
		Integer b = Integer.parseInt(string[1]);
		
		Integer dInteger = 0;
		Integer rInteger = 0;
		Double d;
		
		dInteger = a / b;
		rInteger = a % b;
		d = (double)a / (double)b;
		
		final String FORMAT = "%d %d %f";
		
		String s = String.format(FORMAT, dInteger,rInteger,d);
		System.out.println(s);
	}
}