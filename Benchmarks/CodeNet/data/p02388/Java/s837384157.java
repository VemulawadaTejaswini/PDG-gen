import java.io.*;
public class Main {
	public static void main (String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String side[] = line.split(" ");
		int x = Integer.parseInt(side[0]);
		int y = Integer.parseInt(side[1]);	
		int area = x * y;
		int cir  = 2 * (x + y); 
		System.out.println(area + " " +cir);
	}
}