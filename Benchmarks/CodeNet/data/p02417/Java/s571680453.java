import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] count = new int [26];
		char a = 'a';

		while(true){
			String str = br.readLine();
			if(str.equals("")){
				break;
			}
			for(int i = 0; i <str.length(); i++){
				if(Character.isUnicodeIdentifierStart(str.charAt(i))){
					int num = Character.toLowerCase(str.charAt(i)) - 'a';
					count[num]++;
				}
			}
		}
		for(int i = 0; i < count.length; i++){
			System.out.println((a++)+" : "+count[i]);
		}
	}
}