import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pntT = 0;
		int pntH = 0;
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String strT = sc.next();
			String strH = sc.next();
			if(strT.compareTo(strH) > 0 ) {
				pntT += 3;
			} else if(strT.compareTo(strH) == 0 ) {
				pntT += 1;
				pntH += 1;
			} else if(strT.compareTo(strH) < 0 ) {
				pntH += 3;
			}
		}
		System.out.println(pntT + " " + pntH);
		
		sc.close();
	}
	
}
