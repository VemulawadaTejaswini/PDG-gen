import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String w = br.readLine();
		String line;
		int count = 0;
		while(!(line = br.readLine()).equals("END_OF_TEXT")){
			line = line.toLowerCase();
			String[] words = line.split(" ");
			for(int i = 0;i < words.length;i++){
				if(words[i].equals(w)){
					count++;
				}
			}
		}
		System.out.println(count);
	}

}