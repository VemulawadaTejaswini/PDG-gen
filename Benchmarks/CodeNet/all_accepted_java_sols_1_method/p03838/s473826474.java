
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		long x=sc.nextLong();
		long y=sc.nextLong();

		if(y==0) {
			if(x==0) {
				System.out.println(0);
			}
			else if(x<0) {
				System.out.println(Math.abs(x));
			}
			else if(x>0) {
				System.out.println(Math.abs(x)+1);
			}
		}
		else if(x==0) {
			if(y==0) {
				System.out.println(0);
			}

			else if(y<0) {
				System.out.println(Math.abs(y)+1);
			}
			else if(y>0) {
				System.out.println(Math.abs(y));
			}
		}
		else {
			if(x<0 && y<0) {
				if(x<=y) {
					System.out.println(y-x);
				}
				else if(x>y) {
					System.out.println(x-y+2);
				}
			}

			else if(x>0 && y<0) {
				if(x>=(y*-1)) {
					System.out.println(x+y+1);
				}

				else if(x<(y*-1)) {
					System.out.println(-x-y+1);
				}
			}

			else if(x<0 && y>0) {
				if(-x<=y) {
					System.out.println(Math.min(y-x, y+x+1));
				}

				else if(-x>y) {
					System.out.println(Math.min(y-x, -x-y+1));
				}
			}

			else if(x>0 && y>0) {
				if(x<=y) {
					System.out.println(y-x);
				}

				else if(x>y) {
					System.out.println(x-y+2);
				}
			}
		}
	}
}