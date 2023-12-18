import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i = 1;

		String str = br.readLine();
		for(int x = Integer.parseInt(str); x != 0 ; ){
			if(x != 0)
			System.out.println("Case" + " " + i+":"  + " " +"x" );
			i++;
		}

	}
}