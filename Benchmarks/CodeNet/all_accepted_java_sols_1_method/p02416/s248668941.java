import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while(true){

			String input = br.readLine();
			int sum = 0;

			if(input.equals("0")){
				break;
			}

			for(int i = 0; i < input.length(); i++){
				sum += Character.digit(input.charAt(i), 10);
			}

			sb.append(sum + "\n");

		}

		System.out.print(sb);

	}
}