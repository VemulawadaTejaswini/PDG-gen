import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while(true){

			String str = br.readLine();

			if(str.equals("-")){
				break;
			}

			int num = Integer.parseInt(br.readLine());

			for(int i = 0; i < num; i++){
				int len = Integer.parseInt(br.readLine());
				String bottom = str.substring(0, len);
				String top = str.substring(len);
				str = top + bottom;
			}

			sb.append(str + "\n");

		}

		System.out.print(sb);

	}
}