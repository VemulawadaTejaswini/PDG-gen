import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();

		long x = Long.parseLong(str);
		
		Date date = new Date(x);
		SimpleDateFormat std1 = new SimpleDateFormat("H:m:s");
		
		System.out.println(std1.format(date));
	}
}