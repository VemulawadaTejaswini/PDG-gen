import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = s.substring(0, 2);
		String s2 = s.substring(2, 4);
		int ss1 = Integer.parseInt(s1);
		int ss2 = Integer.parseInt(s2);
		
		if(1 <= ss1 && ss1 <= 12 && 1 <= ss2 && ss2 <= 12) {
			System.out.println("AMBIGUOUS");
		}else if(1 <= ss1 && ss1 <= 12) {
			System.out.println("MMYY");
		}else if(1 <= ss2 && ss2 <= 12) {
			System.out.println("YYMM");
		}else {
			System.out.println("NA");
		}
	}
}