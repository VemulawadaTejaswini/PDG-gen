import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int a = 0;
		if(S.equals("RRR")) {
			a = 3;
		}else if(S.equals("RRS") || S.equals("SRR")) {
			a = 2;
		}else if(S.equals("RSS") || S.equals("RSR") || S.equals("SRS") || S.equals("SSR")) {
			a = 1;
		}else {
			a = 0;
		}
		System.out.println(a);
	}
}
