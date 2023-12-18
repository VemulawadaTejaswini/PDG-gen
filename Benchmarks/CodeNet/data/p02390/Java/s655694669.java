import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int S = sc.nextInt();
		
		sc.close();
		
		String[] hms = new String[3];
		
		for(int i=0; i<2; i++) {
			hms[2-i] = "" + S%60;
			S/=60;
		}
		hms[0] = "" + S;
		
		System.out.println(String.join(":", hms));
		
	}

}