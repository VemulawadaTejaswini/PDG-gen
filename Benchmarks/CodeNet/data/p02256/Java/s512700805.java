import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);

		System.out.println(gcd(x, y));

	}

	public static int gcd(int a, int b){

		if(b == 0){
			return a;
		}else{
			return gcd(b, a % b);
		}

	}

}