

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{

			String strLine = insBR.readLine();

			String strNum = insBR.readLine();
			int intNum = Integer.parseInt(strNum);

			for(int i = 0; i < intNum; i++){

				String[] strOrder = insBR.readLine().split(" ");
				int intFirst = Integer.parseInt(strOrder[1]);
				int intSecond = Integer.parseInt(strOrder[2]);

				if("print".equals(strOrder[0])){
					intSecond += 1;
					String strPrint = strLine.substring(intFirst, intSecond);
					System.out.println(strPrint);

				}else if("reverse".equals(strOrder[0])){

					String[] strReverse = strLine.split("");
					for(int j = intFirst; j < intSecond; j++){
						String strAct = strReverse[j];
						strReverse[j] = strReverse[intSecond];
						strReverse[intSecond] = strAct;
						intSecond--;
					}

					strLine = "";
					for(int j = 0; j < strReverse.length; j++){
						strLine += strReverse[j];
					}
					//System.out.println("reverse = " + strLine);

				}else{
					intSecond += 1;
					String strAct = strLine.substring(intFirst, intSecond);
					//System.out.println("置き換える対象は、" + strAct);
					StringBuilder sb = new StringBuilder();
					sb.append(strLine);
					sb.replace(intFirst, intSecond,strOrder[3]);
					//strLine = strLine.replaceFirst(strAct, strOrder[3]);
					strLine = sb.toString();
					//System.out.println("replace = " + strLine);
				}
			}

		}catch(IOException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}

	}

}

