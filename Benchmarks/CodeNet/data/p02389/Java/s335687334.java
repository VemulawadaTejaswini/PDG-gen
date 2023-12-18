import java.io.*;

class Main
{
	public static void main ( String[] args ) throws IOException{
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		String str1 =   br.readLine();
		String str2 =   br.readLine();
		
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2); 
		
		int men = a * b;
		int syu = ( a + b ) * 2;
		System.out.println( men " " syu);
		
	}
}