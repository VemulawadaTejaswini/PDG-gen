import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	public static void main(String[] args) {
		new Main().count();
	}
	void count() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		int[] az = new int[26];
		try {
			String str;
			while((str=br.readLine())!=null){
				for(int i=0; i<str.length(); i++){
					n = Character.toLowerCase(str.charAt(i)) - 'a';
					if(0<=n && n<26){
						az[n]++;
					}
				}
			}
			
			for(int i=0; i<az.length; i++){
				System.out.printf("%c : %d\n",(char)('a'+ i),az[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}