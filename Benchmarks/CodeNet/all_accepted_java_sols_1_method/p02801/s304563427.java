import java.util.*;
public class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char a1 = a.charAt(0);
		char z = 'z';
		int asciiZ = (int) z; 
		a1=Character.toLowerCase(a1);
		int ascii = (int) a1;
		//System.out.println(ascii);
		if(ascii!=asciiZ) {
		ascii++;
		char res = (char) ascii;
		System.out.println(res);
		}
	}	
}

