import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int alpha_num = 26;
		int[] num = new int[alpha_num];

		for(int i = 0; i < alpha_num; i++){
			num[i] = 0;
		}

		String input = br.readLine().toLowerCase();

		for(int i = 0; i < input.length(); i++){

			char c = input.charAt(i);

			if(Character.isLetter(c)){
				num[c - 'a']++;
			}

		}

		for(char i = 'a'; i <= 'z'; i++){
			System.out.println(i + " : " + num[i - 'a']);
		}

	}
}