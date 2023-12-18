
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		char cha;
		int round;
		int square;
		boolean result;

		while(true) {
			result=true;
			round=0;
			square=0;
			str = br.readLine();

			if(str.equals(".")) {
				break;
			}

			for(int i=0; i<str.length();i++) {
				cha = str.charAt(i);

				if(cha=='(') {	round++;	}
				if(cha==')') {	round--;	}
				if(cha=='[') {	square++;	}
				if(cha==']') {	square--;	}
				if(round<0||square<0) {
					result=false;
					break;
				}
			}
			if(round>0||square>0) {
				result=false;
			}

				if(result) {
				System.out.println("yes");
				}else {
					System.out.println("no");
				}
		}
	}
}

