
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{

			//文字を読み取る。
			String strLineS = insBR.readLine();
			String strLineP =insBR.readLine();
			String strLineSS = strLineS + strLineS;

			//作れるか判定する。
			int intIndex = strLineSS.indexOf(strLineP);
			String strMessage = "";
			if(intIndex != -1){
				strMessage = "Yes";
			}else{
				strMessage = "No";
			}

			//出力。
			System.out.println(strMessage);

		}catch(IOException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
	}

}

