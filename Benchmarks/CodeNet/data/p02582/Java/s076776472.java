import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        String S = sc.nextLine();
	        
		if (S.equals("SSS")) {
			System.out.print("0");
		} else if (S.equals("RSS") || S.equals("SSR") || S.equals("RRS")) {
			System.out.print("2");
		} else if (S.equals("RRR")) {
			System.out.print("3");
		} else {
			System.out.print("1");
		}
		
	}
}