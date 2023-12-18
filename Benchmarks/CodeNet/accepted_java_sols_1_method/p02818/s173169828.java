import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		long buff=0,c=0,d=0;

		buff = a-k;
		if(buff<0) {
			c=b+buff;
			if(c<0) {
				c=0;
			}
			System.out.println(0+" "+c);
		}else {
			System.out.println(buff+" "+b);
		}

	}
}


