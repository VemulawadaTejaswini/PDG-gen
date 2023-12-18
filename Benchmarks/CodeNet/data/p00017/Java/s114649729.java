import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	static final String[] KEYWORD = {"the", "that", "this"};
	
	public static void main(String[] args) throws Exception{
		//暗号を取得
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cipher;
		while((cipher = br.readLine()) != null){
			//正しい複合化のための文字移動量を求める
			int movement = getMovement(cipher);
			//復号した分を出力
			System.out.println(decrypt(movement, cipher));
		}
	}
	
	public static String decrypt(int movement, String cipher){
		char[] c = cipher.toCharArray();
		for(int i = 0; i < c.length; i++){
			//a-z以外は複合しない
			if( c[i] < 'a' || 'z' < c[i] ){
				continue;
			}
			//復号
			c[i] = (char)(c[i] + movement);
			if(c[i] > 'z'){
				int fixMovement = c[i] - 'z';
				c[i] = (char)('a' - 1 + fixMovement);
			}
		}
		return String.valueOf(c);
	}
	private static int getMovement(String cipher){
		int movement = 0;
		for(int i = 1; i < 26; i++){
			if( decrypt(i, cipher).contains(KEYWORD[0]) ||
				decrypt(i, cipher).contains(KEYWORD[1]) ||
				decrypt(i, cipher).contains(KEYWORD[2]) ){
				movement = i;
				break;
			}
		}
		return movement;
	}
}