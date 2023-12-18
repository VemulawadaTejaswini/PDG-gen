import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
public static void main(String[] args){
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
	try {
		String line = reader.readLine();
		int r = Integer.parseInt(line);
		double x,y;
		double pi= Math.PI;
		x=2*r*pi;
		y=r*r*pi;
		System.out.println(+ x + " " + y);
		} catch (IOException e) { 
			System.out.println(e);
		} catch (NumberFormatException e) { 
			System.out.println("error\n");
		}
}
}