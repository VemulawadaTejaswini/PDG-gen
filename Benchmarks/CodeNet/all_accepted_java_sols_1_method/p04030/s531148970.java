import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		StringBuilder ss = new StringBuilder();
		
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(c == '1'){
				ss.append("1");
			}if(c == '0'){
				ss.append("0");
			}if(c == 'B' && ss.length() > 0){
				//ss.replace(ss.length()-1, ss.length(), "");
				ss.deleteCharAt(ss.length()-1);
			}
		}
		System.out.println(ss);
	}
}
