import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str = br.readLine();
		long n = Long.parseLong(str);
		
		System.out.println(f(n));
	}
	static long f(long n){
		if(n < 2)
			return 1;
		return(n * f(n-1));
	}

}