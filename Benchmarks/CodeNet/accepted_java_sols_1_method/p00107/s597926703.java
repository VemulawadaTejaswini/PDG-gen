import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int d,w,h;
		while((d = scn.nextInt())!=0) {
			w = scn.nextInt();
			h = scn.nextInt();
			int max = Math.max(d, Math.max(w,h));
			long L = d*d + w*w + h*h -max*max;
			int n = scn.nextInt();
			for(int i = 0; i < n;i++) {
				int a = scn.nextInt();
				System.out.println(L < 4*a*a?"OK":"NA");
			}
		}
		scn.close();
	}
}

