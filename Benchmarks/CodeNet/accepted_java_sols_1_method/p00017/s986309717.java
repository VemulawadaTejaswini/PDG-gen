import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main{
	public static void main(String[] args){
		Pattern pattern = Pattern.compile("this|that|the");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		try{
			while ((buffer = br.readLine()) != null) {
				//暗号解読部
				char[] cipher = buffer.toCharArray();

				//暗号解読に正解していれば、解読文を表示
				//全ての文字を、ひとつ後ろの文字にずらす(例：a→b,z→a)
				for(int i=0;!pattern.matcher(String.valueOf(cipher)).find() & i < 25;i++){
					for(int j=0;j < cipher.length;j++){
						if(97 <= cipher[j] && cipher[j] <= 121){
							cipher[j]++;
						}else if(cipher[j] == 122){
							cipher[j] = 97;
						}
					}
				}
				System.out.println(cipher);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}