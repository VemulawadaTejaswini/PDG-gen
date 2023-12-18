import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int x = Integer.parseInt(br.toString());
		int i = 1;

		while(true){
			if(x == 0){
				break;
			}
			sb.append("Case ").append(Integer.valueOf(i++)).append(": ").append(Integer.valueOf(x)).append("\n");
		}
		System.out.println(sb);
	}

}