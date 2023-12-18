import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int count = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");

		for (int i  = count-1; i >= 0; i--) {
			if(i != count -1){
				sb.append(" ");
			}
			sb.append(line[i]);
		}
		System.out.println(sb.toString());
	}
}