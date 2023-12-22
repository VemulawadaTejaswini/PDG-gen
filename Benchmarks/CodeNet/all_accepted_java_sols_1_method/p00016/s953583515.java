import java.io.*;
import java.math.*;

public class Main {
	public static void main(String args[]) throws IOException{
		String str[] = new String[2];
		double x = 0, y = 0, angle = 0, deg = 0;
		int step = 0;
		
		BufferedReader input =
				new BufferedReader(new InputStreamReader(System.in));
		while(true){
			str = input.readLine().split(",");
			step = Integer.parseInt(str[0]);
			deg = Double.parseDouble(str[1]);
			
			x += step * Math.sin(Math.toRadians(angle));
			y += step * Math.cos(Math.toRadians(angle));
			
			angle += deg;
			
			if(str[0].equals("0") && str[1].equals("0")){
				System.out.println((int)x + "\n" +(int) y);
				break;
			}
		}
	}
}