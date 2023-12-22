import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	String s = sc.next();
	boolean flagA = false;
	boolean flagB = false;
	boolean flagX = false;
	for(int i = 0; i < a; i++) {
		for(int j = 0; j <= 9; j++) {
			if(Character.getNumericValue(s.charAt(i)) == j) {
				flagA = true;
				break;
			} else {
				flagA = false;
			}
		}
	}
	if(s.charAt(a) == '-') {
		flagX = true;
	}
	for(int i = a + 1; i < a + b + 1; i++) {
		for(int j = 0; j <= 9; j++) {
			if(Character.getNumericValue(s.charAt(i)) == j) {
				flagB = true;
				break;
			} else {
				flagB = false;
			}
		}
	}
	if(flagA == true && flagX == true && flagB == true) {
		System.out.println("Yes");
	} else {
		System.out.println("No");
	}
}
}