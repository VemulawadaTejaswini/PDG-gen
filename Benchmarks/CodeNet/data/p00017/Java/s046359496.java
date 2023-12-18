import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static final String[] KEYWORD = {"the","that","this"};

	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cipher;
		while((cipher = br.readLine()) != null){
			int movement = getMovement(cipher);
			System.out.println(decrypt(movement, cipher));
		}
	}
	public static String decrypt(int movement, String cipher){
		char[] c = cipher.toCharArray();
		for(int i=0;i<c.length; i++){
			if(c[i]<'a'||'z'<c[i]){
				continue;
			}
			c[i]=(char)(c[i]+movement);
			if(c[i]>'z'){
				int fixMovement = c[i] - 'z';
				c[i] = (char)('a'-1+fixMovement);
			}
		}
		return String.valueOf(c);
	}
	private static int getMovement(String cipher){
		int movement = 0;
		for(int i =1; i<26; i++){
			if( decrypt(i,cipher).contains(KEYWORD[0]) ||
					decrypt(i, cipher).contains(KEYWORD[1])||
					decrypt(i, cipher).contains(KEYWORD[2]) ){
				movement = i;
				break;
			}
		}
		return movement;

		}
	}