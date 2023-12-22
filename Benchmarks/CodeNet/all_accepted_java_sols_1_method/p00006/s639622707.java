import java.util.Scanner;

public class Main {
	public static void main(String arges[]){
		String p;
		Scanner sc = new Scanner (System.in);
		p = sc.next();
		int len = p.length();
		for(int i=len-1; i>=0;i--){
				System.out.print(p.charAt(i));
		}
		System.out.println();
		
	}
}