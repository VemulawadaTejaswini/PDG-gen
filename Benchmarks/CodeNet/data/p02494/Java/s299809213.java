import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true){
			String line = input.readLine();
			String[] num = line.split(" ");
			int tate = Integer.parseInt(num[0]);
			int yoko = Integer.parseInt(num[1]);

			if(tate == 0 && yoko == 0) break;

			for(int i = 0 ; i < tate ; i++){
				for(int j = 0 ; j < yoko ; j++){
					sb.append("#");
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

}