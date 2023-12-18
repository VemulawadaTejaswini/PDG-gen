import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = 0, s = 0;
		q = scan.nextInt();
		for(int i = 1;i <= q; i++) {
			int c = scan.nextInt();
			int a = scan.nextInt();
			int n = scan.nextInt();
			while(true) {
				if(	c >= 1 && a >= 1 && n >= 1) {	//CANか判定
					s = s + 1;
					c --;
					a --;
					n --;
				} else if( a >= 1 && c >= 2) {	//CCAか判定
					s = s + 1;
					c -= 2;
					a --;
				} else if(c >= 3) {	//CCCか判定
					s = s + 1;
					c = c -3;
				} else {
					break;
				}
			}
			System.out.println(s);
			s = 0;
			c = 0;
			a = 0;
			n = 0;
		}
	}
}