import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringBuilder str = new StringBuilder();
		str.append(br.readLine());
		int num = Integer.parseInt(br.readLine());

		for(int i = 0; i < num; i++){

			String[] input = br.readLine().split(" ");
			String ope = input[0];
			int start = Integer.parseInt(input[1]);
			int end = Integer.parseInt(input[2]);

			if(ope.equals("print")){
				sb.append(str.substring(start, end + 1) + "\n");
			}else if(ope.equals("reverse")){
				StringBuilder word = new StringBuilder();
				word.append(str.substring(start, end + 1));
				word.reverse();
				str.replace(start, end, word.toString());
			}else if(ope.equals("replace")){
				String word = input[3];
				str.replace(start, end, word);
			}

		}

		System.out.print(sb);

	}
}