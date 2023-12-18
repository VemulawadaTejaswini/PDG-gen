import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strIn = scan.next();
		int intLoop = scan.nextInt();
		int intStart = 0;
		int intEnd = 0;
		String strReplace = "";
		String strTemp = "";
		for(int i = 0; i < intLoop; i++){
			String strOrder = scan.next();
			if("print".equals(strOrder)){
				intStart = scan.nextInt();
				intEnd = scan.nextInt();
				strTemp = "";
				for(int j = intStart; j <= intEnd; j++){
					strTemp += strIn.charAt(j);
				}
				System.out.println(strTemp);
			}else if("reverse".equals(strOrder)){
				intStart = scan.nextInt();
				intEnd = scan.nextInt();
				strTemp = "";
				String strReverse ="";
				for(int j = intStart; j <= intEnd; j++){
					strTemp += strIn.charAt(j);
				}
				StringBuffer sb = new StringBuffer(strTemp);
		        strTemp = sb.reverse().toString();
		        int k = 0;
				for(int j = 0; j < strIn.length(); j++){
					if(intStart <= j && j <= intEnd){
						strReverse += strTemp.charAt(k);
						k++;
					}else{
						strReverse += strIn.charAt(j);
					}
				}
				strIn = strReverse;
			}else if("replace".equals(strOrder)){
				intStart = scan.nextInt();
				intEnd = scan.nextInt();
				strReplace = scan.next();
				strTemp = "";
				boolean isInsert = true;
				for(int j = 0; j < strIn.length(); j++){
					if(intStart <= j && j <= intEnd){
						if(isInsert){
							strTemp += strReplace;
							isInsert = false;
						}
					}else{
						strTemp += strIn.charAt(j);
					}
				}
				strIn = strTemp;
			}
		}
		scan.close();
	}
}