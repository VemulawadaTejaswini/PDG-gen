import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int max = n;
		int min = 0;
		int l;
		int r;
		for(;0<m;m--) {
			l = scn.nextInt();
			r = scn.nextInt();
			if(min<l) {
				min = l;
			}
			if(r<max) {
				max = r;
			}
		}
		if(max-min<0) {
			System.out.println(0);
		}else {
			System.out.println(max-min + 1);
		}
	}
}