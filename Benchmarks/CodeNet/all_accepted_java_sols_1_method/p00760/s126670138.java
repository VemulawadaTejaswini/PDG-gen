import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		for(int i = 0; i < n; i++) {
			int y = stdIn.nextInt();
			int m = stdIn.nextInt();
			int d = stdIn.nextInt();
			int c = 0;
			while(true) {
				if(y == 1000 && m == 1 && d == 1) {
					break;
				}
				d++;
				c++;
				if(y % 3 == 0) {
					if(d > 20) {
						m++;
						d = 1;
						if(m > 10) {
							m = 1;
							y++;
						}
					}
				}
				else {
					if(m %2 == 0) {
						if(d > 19) {
							m++;
							d = 1;
							if(m > 10) {
								m = 1;
								y++;
							}
						}
					}
					else {
						if(d > 20) {
							m++;
							d = 1;
							if(m > 10) {
								m = 1;
								y++;
							}
						}
					}
				}
			}
			System.out.println(c);
		}
	}

}