import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		int count[] = new int[26];
		String works = s.toLowerCase();
		for(int i = 0; i < count.length; i++){
			count[i] = 0;
		}
		for(int i = 0; i < works.length(); i++){
			for(int j = 0; j < count.length; j++){
				if(works.charAt(i) == 'a' + j){
					count[j]++;
				}
			}
		}
		char c = 'a';
		for(int i = 0; i < count.length; i++){
			System.out.println(c + " : "+ count[i]);
			c += 1;
		}
	}

}