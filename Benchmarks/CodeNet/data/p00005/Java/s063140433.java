import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String str =  br.readLine();
			if(str == null || str == "")
			String[] str1Ary = str.split(" ");
			long a = Integer.parseInt(str1Ary[0]);
			long b = Integer.parseInt(str1Ary[1]);
			System.out.println(getGCD(a, b) + " " + getLCM(a, b));
		}
		
	}

	private static long getGCD(long a, long b){
		long r;
		while ((r = a % b) != 0) {
			a = b;
			b = r;
		}
		return b;
	}

	private static long getLCM(long a, long b) {
		return a * b / getGCD(a, b);
	}
}