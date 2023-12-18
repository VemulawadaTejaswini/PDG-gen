import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);
	static int dd = 0;

	public static void main(String[] args){
		String theS = "the";
		String thisS = "this";
		String thatS = "that";
		String[] theZ = changeCip(theS);
		String[] thisZ = changeCip(thisS);
		String[] thatZ = changeCip(thatS);
		/* for(int i = 0; i < 26; i++){
			System.out.printf("%s\n", theZ[i]);
		} */
		String cipLine = readCip();
		boolean flag = false;
		boolean flag2 = false;
		flag = seekWord(cipLine, theZ);
		flag2 = seekWord(cipLine, thisZ, thatZ);
		if(flag == true || flag2 == true){
			String stLine = backCip(cipLine);
			System.out.printf("%s\n", stLine);
		}
	}

	public static String[] changeCip(String str){
		String[] changeZ = new String[26];
		for(int h = 0; h < 26; h++){
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < str.length(); i++){
				char cs = str.charAt(i);
				char cz = (char)('a' + (cs - 'a' + h) % 26);
				sb.append(cz);
			}
			changeZ[h] = sb.toString();
		}
		return changeZ;
	}

	public static String readCip(){
		String line = scan.nextLine();
		return line;
	}

	public static boolean seekWord(String str, String[] stArr1){
		boolean flag = false;
		for(int i = 0; i < str.length() - 2; i++){
			char ch = str.charAt(i);
			char ch1 = str.charAt(i + 1);
			char ch2 = str.charAt(i + 2);
			for(int j = 0; j < 26; j++){
				char cz =stArr1[j].charAt(0);
				char cz1 = stArr1[j].charAt(1);
				char cz2 = stArr1[j].charAt(2);
				if(ch == cz && ch1 == cz1 && ch2 == cz2){
					dd = j;
					flag = true;
					break;
				}
			}
		}
		return flag;
	}
	public static boolean seekWord(String str, String[] stArr1, String[] stArr2){
		boolean flag = false;
		for(int i = 0; i < str.length() - 3; i++){
			char ch = str.charAt(i);
			char ch1 = str.charAt(i + 1);
			char ch2 = str.charAt(i + 2);
			char ch3 = str.charAt(i + 3);
			for(int j = 0; j < 26; j++){
				char cx = stArr1[j].charAt(0);
				char cx1 = stArr1[j].charAt(1);
				char cx2 = stArr1[j].charAt(2);
				char cx3 = stArr1[j].charAt(3);
				char cy = stArr2[j].charAt(0);
				char cy1 = stArr2[j].charAt(1);
				char cy2 = stArr2[j].charAt(2);
				char cy3 = stArr2[j].charAt(3);
				if(ch == cx && ch1 == cx1 && ch2 == cx2 && ch3 == cx3){
					dd = j;
					flag = true;
					break;
				}
				if(ch == cy && ch1 == cy1 && ch2 == cy2 && ch3 == cy3){
					dd = j;
					flag = true;
					break;
				}
			}
		}
		return flag;
	}

	public static String backCip(String str){
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < str.length() ; i++){
			char cz = str.charAt(i);
			if(cz >= 'a' && cz <= 'z'){
				char cs = (char)('a' + (cz - dd - 'a') % 26);
				sb.append(cs);
			} else{
				char cs = cz;
				sb.append(cs);
			}
		}
		String back = sb.toString();
		return back;
	}
}