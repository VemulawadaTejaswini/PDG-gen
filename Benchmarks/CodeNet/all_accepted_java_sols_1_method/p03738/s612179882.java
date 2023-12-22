import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String a = sc.next();
	String b = sc.next();
	if(a.length() > b.length()) {
		System.out.println("GREATER");
	}
	if(a.length() < b.length()) {
		System.out.println("LESS");
	}
	if(a.length() == b.length()) {
		if(a.compareTo(b) > 0) {
			System.out.println("GREATER");
		}
		if(a.compareTo(b) < 0) {
			System.out.println("LESS");
		}
		if(a.compareTo(b) == 0) {
			System.out.println("EQUAL");
		}
	}
}
}