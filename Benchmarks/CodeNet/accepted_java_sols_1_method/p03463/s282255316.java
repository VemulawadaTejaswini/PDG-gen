import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		String []input = br.readLine().split(" ");
		int board = Integer.parseInt(input[0]);
		int alice = Integer.parseInt(input[1]);
		int borys = Integer.parseInt(input[2]);
		if(Math.abs(alice - borys)%2 == 0) {
			System.out.println("Alice");//お互いの差が偶数だったら
		}else {
			System.out.println("Borys");//お互いの差が奇数だったら
		}
	}
}