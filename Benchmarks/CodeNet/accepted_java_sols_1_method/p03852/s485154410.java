import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int a = Integer.parseInt(sc.next());
		//int b = Integer.parseInt(sc.next());
		//int c = Integer.parseInt(sc.next());
		//int n = Integer.parseInt(sc.next());
		//long res=n;
		//int l = Integer.parseInt(sc.next());
		//int sum=0;
		String s = sc.next();
		//String t = sc.next();
		//String b = sc.next();
		//int a = Integer.parseInt(sc.next());
		//String t = sc.next();

		if(s.equals("a") ||s.equals("e") ||s.equals("i") ||s.equals("o") || s.equals("u")) {//a、e、i、o、u
			System.out.println("vowel");
		}else {
			System.out.println("consonant");
		}
		//System.out.println("A"+t.substring(0,1)+"C");
	}
}


