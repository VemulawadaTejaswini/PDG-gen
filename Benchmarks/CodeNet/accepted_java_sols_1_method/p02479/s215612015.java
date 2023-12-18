import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(read.readLine());
		System.out.printf("%f %f \n",r*r*java.lang.Math.PI,(r+r)*java.lang.Math.PI);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}
}