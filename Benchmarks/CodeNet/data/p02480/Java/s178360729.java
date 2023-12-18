import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		String line=reader.readLine();
		int n=Integer.parseInt(line);
		System.out.println(n*n*n);
	}

}