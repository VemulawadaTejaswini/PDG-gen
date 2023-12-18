import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){

		String theS = "the";
		String thisS = "this";
		String thatS = "that";
		String[] theZ = backChange(theS);
		String[] thisZ = backChange(thisS);
		String[] thatZ = backChange(thatS);
		
		String line = scan.nextLine();
		int dd = 0;
		char[] cArr = line.toCharArray();
		boolean flag = false;
		for(int i = 0; i < 26; i++){
			if(cArr[0] == theZ[i].charAt(0) && cArr[1] == theZ[i].charAt(1)
				&& cArr[2] == theZ[i].charAt(2)){
				dd = i;
				flag = true;
			} else if(cArr[0] == thisZ[i].charAt(0) && cArr[1] == thisZ[i].charAt(1)
					&& cArr[2] == thisZ[i].charAt(2) && cArr[3] == thisZ[i].charAt(3)){
				dd = i;
				flag = true;
			} else if(cArr[0] == thatZ[i].charAt(0) && cArr[1] == thatZ[i].charAt(1)
					&& cArr[2] == thatZ[i].charAt(2) && cArr[3] == thatZ[i].charAt(3)){
				dd = i;
				flag = true;
			}
		}
		if(flag == true){
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < cArr.length; i++){
				char cs;
				if(cArr[i] >= 'a' && cArr[i] <= 'z'){
					cs = (char)('a' + (cArr[i] - 'a' - dd) %26);
				} else{
					cs = cArr[i];
				}
				sb.append(cs);
			}
			String backLine = sb.toString();
		}
	}

	public static String[] backChange(String str){
		String[] backS = new String[26];
		for(int i = 0; i < 26; i++){
			StringBuffer sb = new StringBuffer();
			for(int j = 0; j < str.length(); j++){
				char cz = str.charAt(j);
				// i???????????????????????????
				char cs = (char)('a' + (cz - 'a' - i) % 26);
				sb.append(cs);
			}
			backS[i] = sb.toString();
		}
		return backS;
	}
}