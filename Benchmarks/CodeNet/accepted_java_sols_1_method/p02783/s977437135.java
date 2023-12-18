import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ah = br.readLine().split(" ");
		int a = Integer.parseInt(ah[1]);
		int h = Integer.parseInt(ah[0]);
		if(h % a == 0 ) {
			System.out.println(h/a);
		}else {
			System.out.println(h/a+1);
		}
	}

}
