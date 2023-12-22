import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int alpha_num = 26;
		int[] num = new int[alpha_num];
		String input = "";

		for(int i = 0; i < alpha_num; i++){
			num[i] = 0;
		}

		while((input = br.readLine()) != null){

			input = input.toLowerCase();

			for(int i = 0; i < input.length(); i++){

				char c = input.charAt(i);

				if(Character.isLetter(c)){
					num[c - 'a']++;
				}

			}

		}

		for(char i = 'a'; i <= 'z'; i++){
			System.out.println(i + " : " + num[i - 'a']);
		}

	}
}