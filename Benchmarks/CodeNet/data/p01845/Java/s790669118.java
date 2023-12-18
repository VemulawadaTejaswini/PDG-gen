import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int R0 = sc.nextInt();
			int W0 = sc.nextInt();
			int C = sc.nextInt();
			int R = sc.nextInt();
			if(R0==0 && W0==0 && C==0 && R==0) break;
			int min=0;
			for(int i=0; ; i++) {
				if(W0 * C <= R0 + R * i) {
					min = i;
					break;
				}
			}
			System.out.println(min);
		}
	}
}

