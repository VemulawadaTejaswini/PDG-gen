import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long x=0;
		int count=0;
		while(h>0) {
			h/=2;
			count++;
		}
		for(int i=0;i<count;i++) {
			x+=Math.pow(2, i);
		}

		  		System.out.print(x);

	}
}