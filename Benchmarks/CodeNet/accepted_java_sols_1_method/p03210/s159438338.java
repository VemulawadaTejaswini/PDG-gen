import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int n = 0;
	public static void main(String[] args) throws Exception{
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			n = Integer.parseInt(br.readLine());
			String re;
			if(n == 3 || n == 5 || n == 7) re = "YES";
			else re = "NO";
			System.out.println(re);
		}

	}

}