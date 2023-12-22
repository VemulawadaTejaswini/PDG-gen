import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while(true) {
			String num = br.readLine();
			String[] set = num.split(" ");

			int a = Integer.parseInt(set[0]);
			int b = Integer.parseInt(set[1]);

			if (a==0 && b==0) {
				break;
			}

			for (int i = 0; i < a ; i++) {
				for (int j = 0; j < b ; j++) {
					if(i%2==0) {
						if(j%2==0) {
							sb.append("#");
						}else {
							sb.append(".");
						}
					}else{
						if(j%2==0) {
							sb.append(".");
						}else {
							sb.append("#");
						}
					}
				}
				sb.append("\n");
			}
			sb.append("\n");
		}

		System.out.print(sb);

	}

}