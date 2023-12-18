import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] nyuryoku = line.split("[\\s]+");
		int hikaku_a = Integer.parseInt(nyuryoku[0]);
		int hikaku_b = Integer.parseInt(nyuryoku[1]);

		if(hikaku_a > hikaku_b){
			System.out.println("a > b");
		} else if(hikaku_a < hikaku_b){
			System.out.println( "a < b");
		} else {
			System.out.println("a == b");
		}
	}
}