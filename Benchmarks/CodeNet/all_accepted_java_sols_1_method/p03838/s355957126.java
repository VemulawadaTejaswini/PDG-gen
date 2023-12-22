import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		if (x==y) {
			System.out.println(0);
			return ;
		}
		if (x==-y) {
			System.out.println(1);
			return ;
		}
		long count =0;
		if (x<0&&y<0) {
			if (x>y) {
				count =Math.abs(x-y)+2;
			} else {
				count =Math.abs(x-y);
			}
		} else if ((x>0&&y<0)||(x<0&&y>0)) {
			count = Math.abs(Math.abs(x)-Math.abs(y))+1;
		} else if (x>0&&y>0) {
			count =Math.abs(x-y);
			if (x>y) {
				count +=2;
			}
		}else if (x==0) {
			count +=Math.abs(y);
			if (y<0) {
				count ++;
			}
		} else {
			count +=Math.abs(x);
			if (x>0) {
				count ++;
			}
		}

		System.out.println(count);
	}
}