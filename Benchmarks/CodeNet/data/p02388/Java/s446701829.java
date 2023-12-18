import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		System.out.println((int)Math.pow(num, 3));

	}
}