
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] as = br.readLine().split(" ");
		int a = Integer.parseInt(as[0]);
		int b = Integer.parseInt(as[1]);
		int c = Integer.parseInt(as[2]);
		if(a== b && c == b) {
			System.out.println("No");
		}else if(a ==b || c == a || b == c){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
