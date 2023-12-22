import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		String strCom = " ";
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		while(true){
			String charaStr = br.readLine();
			if (charaStr.equals("-")){
				break;
			}

			int shuffleNum =Integer.parseInt(br.readLine());

			for (int i = 0;i < shuffleNum;i++){

				int moveLength = Integer.parseInt(br.readLine());
				
				if (i == 0) {
					strCom = charaStr;
				}
				
				String str1 = strCom.substring(0, moveLength);
				String str2 = strCom.substring(moveLength, strCom.length());

				strCom = str2.concat(str1);
			}
			System.out.println(strCom);
		}
	}
}