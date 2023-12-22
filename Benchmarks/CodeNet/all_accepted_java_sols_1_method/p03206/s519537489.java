import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = "";
		if(n == 25) s = "Christmas";
		else if(n == 24) s = "Christmas Eve";
		else if(n == 23) s = "Christmas Eve Eve";
		else if(n == 22) s = "Christmas Eve Eve Eve";
		System.out.println(s);
	}

}
