import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(Character.isUpperCase(s.charAt(0))){
			System.out.println("A");
		}else if(Character.isLowerCase(s.charAt(0))){
			System.out.println("a");
		}
	}
}
