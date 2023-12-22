import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		String []input = br.readLine().split(" ");
		int board = Integer.parseInt(input[0]);
		int alice = Integer.parseInt(input[1]);
		int borys = Integer.parseInt(input[2]);

		if(Math.abs(alice - borys) == 1 ) {
			System.out.println("Borys");
		}else if(Math.abs(alice - borys) == 2) {
			System.out.println("Alice");
		}else if(Math.abs(alice - borys)%2 == 0) {
			System.out.println("Alice");
		}else {
			System.out.println("Borys");
		}

	}

}