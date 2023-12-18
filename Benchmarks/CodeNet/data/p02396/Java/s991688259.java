import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int x = Integer.valueOf(br.toString());
		boolean check = true;
		int i = 1;

		while(check){
			if(x == 0){
				check = false;
				break;
			}
			sb.append("Case ").append(Integer.valueOf(i++)).append(": ").append(Integer.valueOf(x)).append("\n");
		}
		System.out.println(sb);
	}

}