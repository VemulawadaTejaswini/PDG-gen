import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		for(int i=0; i<a.length(); i++){
			
			if (b.equals(a)){
				System.out.println("Yes");
				return;
			}
//			System.out.println(a.substring(a.length()-1));
//			System.out.println(a.substring(0, a.length()-1));
			a = (a.substring(a.length()-1)).concat(a.substring(0, a.length()-1));
//			System.out.println("--");
//			System.out.println(a);
		}
		
		
		
		
		System.out.println("No");
		
	}

}
