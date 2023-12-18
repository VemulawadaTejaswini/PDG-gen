import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int e = sc.nextInt();
			if(e == 0) break;
			int m = 1000000;
			for(int z=1;;z++) {
				int xy = e-z*z*z;
				if(xy<0) break;
				for(int y=0;y*y<=xy;y++) {
					int x = xy-y*y;
					m = Math.min(m, x+y+z);
				}
			}
			System.out.println(m);
		}
	}
}
