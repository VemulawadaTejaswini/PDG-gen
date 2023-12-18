import java.io.*;

class Main
{
	public static void main ( String[] args ) throws IOException{
		BufferedReader reader =
		new BufferedReader(new InputStreamReader(System.in));
		String[] line = reader.readLine().split(" ");
		
		
		int a = Integer.parseInt(line1);
		int b = Integer.parseInt(line2); 
		
		int men = a * b;
		int syu = ( a + b ) * 2;
		System.out.println( men  + " " + syu);
		
	}
}