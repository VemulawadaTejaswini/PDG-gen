import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);
	static int dd = 0;
	static String theS = "the";
	static String thisS = "this";
	static String thatS = "that";
	static String[] theZ = changeCip(theS);
	static String[] thisZ = changeCip(thisS);
	static String[] thatZ = changeCip(thatS);

	public static void main(String[] args){

		while(scan.hasNext()){
			String cipLine = scan.nextLine();
			boolean flagThe = false;
			boolean flagThis = false;
			boolean flagThat = false;
			for(int i = 0; i < cipLine.length() ; i++){
				flagThe = findThe(cipLine);
				flagThis = findThis(cipLine);
				flagThat = findThat(cipLine);
				if(flagThe == true || flagThis == true || flagThat == true){
					String backLine = backCip(cipLine);
					System.out.printf("%s\n", backLine);
					break;
				}
			}
		}
	}

	public static String[] changeCip(String str){
		String[] changeZ = new String[26];
		for(int h = 0; h < 26; h++){
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < str.length(); i++){
				char cs = str.charAt(i);
				char cz = (char)('a' + (cs  + h - 'a') % 26);
				sb.append(cz);
			}
			changeZ[h] = sb.toString();
		}
		return changeZ;
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

	public static boolean findThe(String str){
		boolean flag = false;
		for(int i = 0; i < str.length() - 2; i++){
			char ch = str.charAt(i);
			char ch1 = str.charAt(i + 1);
			char ch2 = str.charAt(i + 2);
			for(int j = 0; j < 26; j++){
				char cx = theZ[j].charAt(0);
				char cx1 = theZ[j].charAt(1);
				char cx2 = theZ[j].charAt(2);
				if(ch == cx && ch1 == cx1 && ch2 == cx2){
					dd = j;
					flag =true;
					break;
				}
			}
			if(flag)break;
		}
		return flag;
	}
	public static boolean findThis(String str){
		boolean flag = false;
		for(int i = 0; i < str.length() - 3 ; i++){
			char ch = str.charAt(i);
			char ch1 = str.charAt(i + 1);
			char ch2 = str.charAt(i + 2);
			char ch3 = str.charAt(i + 3);
			for(int j = 0; j < 26; j++){
				char cy = thisZ[j].charAt(0);
				char cy1 = thisZ[j].charAt(1);
				char cy2 = thisZ[j].charAt(2);
				char cy3 = thisZ[j].charAt(3);
				if(ch == cy && ch1 == cy1 && ch2 == cy2 && ch3 == cy3){
					dd = j;
					flag = true;
					break;
				}
			}
			if(flag)break;
		}
		return flag;
	}
	public static boolean findThat(String str){
		boolean flag = false;
		for(int i = 0; i < str.length() - 3; i++){
			char ch = str.charAt(i);
			char ch1 = str.charAt(i + 1);
			char ch2 = str.charAt(i + 2);
			char ch3 = str.charAt(i + 3);
			for(int j = 0; j < 26; j++){
				char cz = thatZ[j].charAt(0);
				char cz1 = thatZ[j].charAt(1);
				char cz2 = thatZ[j].charAt(2);
				char cz3 = thatZ[j].charAt(3);
				if(ch == cz && ch1 == cz1 && ch2 == cz2 && ch3 == cz3){
					dd = j;
					flag = true;
					break;
				}
			}
			if(flag)break;
		}
		return flag;
	}
}