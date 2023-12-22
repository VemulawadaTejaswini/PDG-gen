import java.io.*;

class Main{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strSec = br.readLine();
		int intSec = Integer.parseInt(strSec);
		int h = intSec / 3600;
		int m = (intSec % 3600) / 60;
		int s = (intSec % 3600) % 60;
		System.out.println(h + ":" + m + ":" + s);
	
	}
	
}