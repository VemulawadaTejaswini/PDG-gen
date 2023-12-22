import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int front = Integer.parseInt(s.substring(0,2));
		int back = Integer.parseInt(s.substring(2));
		
		if(front>=1 && front<=12) {
			if(back>=1 && back <=12) {
				System.out.println("AMBIGUOUS");
			}else {
				System.out.println("MMYY");
			}
		}else if(back>=1 && back<=12) {
			System.out.println("YYMM");
		}else {
			System.out.println("NA");
		}
		
		
		sc.close();
	}

}
