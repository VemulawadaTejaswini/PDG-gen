
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		System.out.println(isValid(sn.next())? "VALID": "INVALID");
		
	}
	
	static boolean isValid(String pass){
		if(pass.length() < 6) return false;
		boolean upper = false;
		boolean lower = false;
		boolean number = false;
		for(int i = 0; i < pass.length(); i++){
			int code = (int)pass.charAt(i);
			if(code >= 97 && code <= 122) lower = true;
			if(code >= 65 && code <= 90) upper = true;
			if(code >= 48 && code <= 58) number = true;
		}
		return upper && lower && number;
	}
}