import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char[] s_one = s.toCharArray();
		boolean chain = true;
		int count = 0;

		if(s.equals("RRR")) {
			count = 3;
		}else if(s.equals("RRS") || s.equals("SRR")){
			count = 2;
		}else if(s.equals("RSS") || s.equals("RSR") || s.equals("SSR") || s.equals("SRS")) {
			count = 1;
		}

		System.out.println(count);
	}
}
