import java.io.*;
public class Main {
	public static void main(String[] args) {
		String s;
		int n=0;
		try{
			BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(reader.readLine());
		}catch(IOException e){
			System.out.println(e);
		}
		n=n*n*n;
		System.out.println(Integer.toString(n));
	}
}