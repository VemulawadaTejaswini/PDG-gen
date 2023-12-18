import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String a = "";
	for(int i = 0; i < s.length(); i++) {
		switch(s.charAt(i)) {
		case '0':
			a += "0";
			break;
		case '1':
			a += "1";
			break;
		case 'B':
			if(a.length() > 0) {
				a = a.substring(0, a.length() - 1);
			}
			break;
		}
	}
	System.out.println(a);
}
}