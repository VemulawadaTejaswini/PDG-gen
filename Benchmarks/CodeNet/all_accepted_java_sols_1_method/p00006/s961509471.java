
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String re ="";
		for(int i = line.length() ; i > 0;i--){
			re += line.charAt(i-1);
		}
		System.out.println(re);

	}

}