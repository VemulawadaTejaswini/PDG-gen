import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		String str=in.next();
		String k=in.next();
		if(isUnder100(k) && Integer.parseInt(k)<str.length()) {
			int i=0,l=Integer.parseInt(k);
			for(;i<l;i++) {
				if(str.charAt(i)>'1') {
					System.out.println(str.charAt(i));
					i=str.length();
					break;
				}
			}
			
			if(i==l)System.out.println(1);
		}
		else {
			int i=0;
			for(;i<str.length();i++) {
				if(str.charAt(i)>'1') {
					System.out.println(str.charAt(i));
					break;
				}
			}
			
			if(i==str.length())System.out.println(1);
		}
	}
	
	static boolean isUnder100(String key) {
		if(key.length()>3)return false;
		else if(key.length()<3)return true;
		else {
			if(key.charAt(0)=='1' && key.charAt(1)=='0' && key.charAt(2)=='0')return true;
			else return false;
		}
	}

}
