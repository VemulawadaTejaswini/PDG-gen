import java.io.*;

public class Main {
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			System.out.println((int)Math.pow(num,3));
		}catch(IOException e){
			System.err.println(e);
		}
	}
}