import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i ;

		for(i = 0; i <= 10000  ;){
			String str = br.readLine();
			int x = Integer.parseInt(str);
			if(x != 0)
			System.out.println("Case" + " " + i+":"  + " " +"x" );
			i++;
		}
	}

}