import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputed;
        int[] alphabets = new int[26];
        char[] Salphabets = new char[26];
        char c = 'a';
        for (int i=0; i<26; i++) {
          Salphabets[i] = c++;
        }
		while(true){

			try {
				inputed = br.readLine();
                if (inputed == null )break;
				for(int i = 0; i < inputed.length(); i++){
                  for(int j = 0; j < 26; j++){  
                    if (inputed.charAt(i)==65+j || inputed.charAt(i)==97+j) {
					alphabets[j] += 1;
				}}}
			} catch (IOException e) {
				e.printStackTrace();
            }
        }
          for(int i =0; i< 26; i++) {
		    System.out.println(Salphabets[i] + " : " + alphabets[i]);
		}
	}
}
