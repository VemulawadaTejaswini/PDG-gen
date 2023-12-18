
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String str2;
		boolean result;

		while(true) {
			result=true;
			str = br.readLine();

			if(str.equals(".")) {
				break;
			}

			while(str.matches(".*\\[.*")||str.matches(".*\\(.*")) {
				str2=str.replaceAll("\\([A-z].*\\)", "");
				str2=str2.replaceAll("\\[[A-z].*\\]", "");
				if(str2.equals(str2)) {
					if(str.matches(".*\\[.*")||str.matches(".*\\(.*")) {
						result=false;
						break;
					}
				}
			}


				if(result) {
				System.out.println("yes");
				}else {
					System.out.println("no");
				}
		}
	}
}

