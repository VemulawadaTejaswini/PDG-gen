import java.util.Scanner;
import java.util.regex.Pattern;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in).useDelimiter("\\r\\n");
		Pattern pattern = Pattern.compile(".*the.*|.*this.*|.*that.*");
		
		//暗号解読部
		while(stdIn.hasNext()){
			char[] cipher = stdIn.next().toCharArray();
			for(int i=0;!pattern.matcher(String.valueOf(cipher)).find() & i < 25;i++){
				//暗号解読に正解していれば、解読文を表示
				//全ての文字を、ひとつ後ろの文字にずらす(例：a→b,z→a)
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
	}
}