import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException {

		Main m = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);

		System.out.println(m.gcd(x, y));

	}

	public int gcd(int num_1, int num_2){

		for(int i = Math.min(num_1, num_2); i > 0; i--){

			if(num_1 % i == 0 && num_2 % i == 0){
				return i;
			}

		}

		return -1;

	}

}