import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		String search = br.readLine();

		while(true){

			String str = br.readLine();

			if(str.equals("END_OF_TEXT")){
				break;
			}

			String[] word = str.split(" ");

			for(int i = 0; i < word.length; i++){
				if(search.equals(word[i])){
					count++;
				}
			}

		}

		System.out.println(count);

	}
}