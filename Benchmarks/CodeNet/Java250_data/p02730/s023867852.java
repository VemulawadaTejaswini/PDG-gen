import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int strlength = str.length();

		String str1 = str.substring(0, (strlength-1)/2);
		String str2 = str.substring((strlength-1)/2 +1,strlength);
		
		if(kaibunHantei(str) && kaibunHantei(str1) && kaibunHantei(str2)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
	
	public static boolean kaibunHantei(String str) {
		int strlength = str.length();
		String str1;
		String str2;
		if(strlength%2==1) {
			str1 = str.substring(0, (strlength-1)/2);
			str2 = str.substring((strlength-1)/2 +1,strlength);
		}else {
			str1 = str.substring(0, (strlength)/2);
			str2 = str.substring((strlength)/2 ,strlength);			
		}
		
		for(int i =0; i<str1.length(); i++) {
			char a = str1.charAt(i);
			char b =str2.charAt(str1.length()-1-i);
			if(a!=b) {
				return false;
			}
		}
		return true;		
	}
}