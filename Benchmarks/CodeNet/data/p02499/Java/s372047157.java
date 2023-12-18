import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	public static void main(String[] args){
		new Main().counter();
	}
	void counter(){
		int[] az = new int[26];
		int[] count = new int[26];
		
		for(int i=0; i<az.length; i++){
			az[i] = 97 + i;
			az[i] = 0;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = null;
		try {
			String str;
			sb = new StringBuilder();
			while((str = br.readLine())!=null){
				sb.append(str);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		char[] chars = sb.toString().toLowerCase().toCharArray();
		
		for(int i=0; i<chars.length; i++){
			for(int j=0; j<az.length; j++){
				if(az[j]==chars[i]){
					count[j]++;
				}
			}
		}
		
		for(int i=0; i<az.length; i++){
			char ch = (char) az[i];
			System.out.printf("%c : %d\n",ch,count[i]);
		}
	}
}