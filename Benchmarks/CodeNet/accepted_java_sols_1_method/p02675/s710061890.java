import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int x = n % 10;
		
		StringBuilder sb = new StringBuilder();
		if(x == 3)
			sb.append("bon\n");
		else if(x == 0 || x == 1 || x == 6 || x == 8)
			sb.append("pon\n");
		else
			sb.append("hon\n");
		
		System.out.println(sb);
		
	}

}