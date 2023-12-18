import java.util.Scanner;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ss = String.valueOf(s.charAt(0)) + (s.length()-2) + String.valueOf(s.charAt(s.length()-1)); 
		System.out.println(ss);
	}
}
