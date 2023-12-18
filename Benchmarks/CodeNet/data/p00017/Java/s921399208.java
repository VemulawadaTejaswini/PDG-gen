import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);
	static int dd = 0;

	public static void main(String[] args){

		while(scan.hasNext()){
			String cipLine = scan.nextLine();
			boolean flagThe = false;
			boolean flagThis = false;
			boolean flagThat = false;
			for(int i = 0; i < cipLine.length() ; i++){
				flagThe = findTheA(cipLine);
				flagThis = findThisA(cipLine);
				flagThat = findThatA(cipLine);
				if(flagThe == true || flagThis == true || flagThat == true){
					String backLine = backCip(cipLine);
					System.out.printf("%s\n", backLine);
					break;
				}
			}
		}
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

	public static boolean findTheA(String str){
		boolean flag = false;
		for(int i = 0; i < str.length() - 2; i++){
			if(i > 0){
				char cm = str.charAt(i - 1);
				if(cm >= 'a' && cm <= 'z'){
					flag = false;
					break;
				}
				char cx = str.charAt(i);
				char cx1 = str.charAt(i + 1);
				char cx2 = str.charAt(i + 2);
				for(int j = 0; j < 26; j++){
					char cs = (char)('a' + (cx - j - 'a') % 26);
					char cs1 = (char)('a' + (cx1 - j - 'a') % 26);
					char cs2 = (char)('a' + (cx2 - j - 'a') % 26);
					if(cs == 't' && cs1 == 'h' && cs2 == 'e'){
						dd = j;
						flag = true;
						break;
					}
				}
				if(flag)break;
			} else{
				char cx = str.charAt(i);
				char cx1 = str.charAt(i + 1);
				char cx2 = str.charAt(i + 2);
				for(int j = 0; j < 26; j++){
					char cs = (char)('a' + (cx - j - 'a') % 26);
					char cs1 = (char)('a' + (cx1 - j - 'a') % 26);
					char cs2 = (char)('a' + (cx2 - j - 'a') % 26);
					if(cs == 't' && cs1 == 'h' && cs2 == 'e'){
						dd = j;
						flag = true;
						break;
					}
				}
				if(flag)break;
			}
		}
		return flag;
	}
	public static boolean findThisA(String str){
		boolean flag = false;
		for(int i = 0; i < str.length() - 3; i++){
			if(i > 0){
				char cm = str.charAt(i - 1);
				if(cm >= 'a' && cm <= 'w'){
					flag = false;
					break;
				} else{
					char cy = str.charAt(i);
					char cy1 = str.charAt(i + 1);
					char cy2 = str.charAt(i + 2);
					char cy3 = str.charAt(i + 3);
					for(int j = 0; j < 26; j++){
						char cs = (char)('a' + (cy - j - 'a') % 26);
						char cs1 = (char)('a' + (cy1 - j - 'a') % 26);
						char cs2 = (char)('a' + (cy2 - j - 'a') % 26);
						char cs3 = (char)('a' + (cy3 - j - 'a') % 26);
						if(cs == 't' && cs1 == 'h' && cs2 == 'i' && cs3 == 's'){
							dd = j;
							flag = true;
							break;
						}
					}
					if(flag)break;
				}
			} else{
				char cy = str.charAt(i);
				char cy1 = str.charAt(i + 1);
				char cy2 = str.charAt(i + 2);
				char cy3 = str.charAt(i + 3);
				for(int j = 0; j < 26; j++){
					char cs = (char)('a' + (cy - j - 'a') % 26);
					char cs1 = (char)('a' + (cy1 - j - 'a') % 26);
					char cs2 = (char)('a' + (cy2 - j - 'a') % 26);
					char cs3 = (char)('a' + (cy3 - j - 'a') % 26);
					if(cs == 't' && cs1 == 'h' && cs2 == 'i' && cs3 == 's'){
						dd = j;
						flag = true;
						break;
					}
				}
				if(flag)break;
			}
		}
		return flag;
	}
	public static boolean findThatA(String str){
		boolean flag = false;
		for(int i = 0; i < str.length() - 3; i++){
			if(i > 0){
				char cm = str.charAt(i - 1);
				if(cm >= 'a' && cm <= 'w'){
					flag = false;
					break;
				} else{
					char cz = str.charAt(i);
					char cz1 = str.charAt(i + 1);
					char cz2 = str.charAt(i + 2);
					char cz3 = str.charAt(i + 3);
					for(int j = 0; j < 26; j++){
						char cs = (char)('a' + (cz - j - 'a') % 26);
						char cs1 = (char)('a' + (cz1 - j - 'a') % 26);
						char cs2 = (char)('a' + (cz2 - j - 'a') % 26);
						char cs3 = (char)('a' + (cz3 - j - 'a') % 26);
						if(cs == 't' && cs1 == 'h' && cs2 == 'a' && cs3 == 't'){
							dd = j;
							flag = true;
							break;
						}
					}
					if(flag)break;					
				}
			} else{
				char cz = str.charAt(i);
				char cz1 = str.charAt(i + 1);
				char cz2 = str.charAt(i + 2);
				char cz3 = str.charAt(i + 3);
				for(int j = 0; j < 26; j++){
					char cs = (char)('a' + (cz - j - 'a') % 26);
					char cs1 = (char)('a' + (cz1 - j - 'a') % 26);
					char cs2 = (char)('a' + (cz2 - j - 'a') % 26);
					char cs3 = (char)('a' + (cz3 - j - 'a') % 26);
					if(cs == 't' && cs1 == 'h' && cs2 == 'a' && cs3 == 't'){
						dd = j;
						flag = true;
						break;
					}
				}
				if(flag)break;
			}
		}
		return flag;
	}
}