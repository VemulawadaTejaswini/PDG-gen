import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int num = Integer.parseInt(br.readLine());

		for(int i = 0; i < num; i++){

			String[] token = br.readLine().split(" ");
			String ope = token[0];
			int start = Integer.parseInt(token[1]);
			int end = Integer.parseInt(token[2]);

			if(ope.equals("print")){
				sb.append(str.substring(start, end + 1) + "\n");
			}else if(ope.equals("reverse")){

				char[] array = str.toCharArray();

				while(start < end){
					char temp = array[start];
					array[start] = array[end];
					array[end] = temp;
					str = String.valueOf(array);
					start++;
					end--;
				}

			}else if(ope.equals("replace")){

				char[] array = str.toCharArray();
				String word = token[3];

				for(int j = 0; j < word.length(); j++){
					array[start + j] = word.charAt(j);
				}

				str = String.valueOf(array);

			}

		}

		System.out.print(sb);

	}
}