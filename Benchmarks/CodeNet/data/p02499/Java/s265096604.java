import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int num=0;
		int alphabet[] = new int[26];

		try{
			while(!(str=br.readLine()).equals("")){

				for(int i=0; i<str.length(); i++){
					num = Character.toLowerCase(str.charAt(i)) - 'a';

					if(0 <= num && num <= 26){
						alphabet[num]++;
					}
				}

			}
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("Error");
		}
		for(int i=0;i<26;i++){
			System.out.println((char)(i+'a') + " : " + alphabet[i]);
		}
	}
}