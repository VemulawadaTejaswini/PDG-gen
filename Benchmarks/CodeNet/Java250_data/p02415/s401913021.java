//??????????????§????????¨?°????????????????
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		int strLength = str.length();
		
		for(int i=0; i<strLength; i++) {
			
			if(Character.isUpperCase(str.charAt(i))) {
				String a =  String.valueOf(str.charAt(i));
				sb.append(a.toLowerCase());
			}	
			else if(Character.isLowerCase(str.charAt(i))) {
				String a =  String.valueOf(str.charAt(i));
				sb.append(a.toUpperCase());
			}
			else {
				String a =  String.valueOf(str.charAt(i));
				sb.append(a);
			}
		}
		System.out.println(sb.toString());
	}	
}