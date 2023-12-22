import java.util.Arrays;
import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int a[] = new int[80];
		int b[] = new int[80];
		int c[] = new int[81];
		int n = Integer.parseInt(scan.next());
		for(int i = 0;i < n;i++){
			Arrays.fill(a,0);
			Arrays.fill(b,0);
			Arrays.fill(c,0);
			String as = scan.next();
			String bs = scan.next();
			int al = as.length();
			if(al > 80){
				System.out.println("overflow");
				continue;
			}
			int bl = bs.length();
			if(bl > 80){
				System.out.println("overflow");
				continue;
			}
			int cl = Math.max(al,bl);
			int m = 79;
			while(al > 0 || bl > 0){
				if(al > 0){
					al--;
					a[m] = Integer.parseInt("" + as.charAt(al));
				}
				if(bl > 0){
					bl--;
					b[m] = Integer.parseInt("" + bs.charAt(bl));
				}				
				m--;
			}
			for(int j = 79;j >= 79 - cl + 1;j--){
				c[j + 1] = c[j + 1] + a[j] + b[j];
				if(c[j + 1] >= 10){
					c[j] = c[j] + 1;
					c[j + 1] = c[j + 1] - 10;
				}
			}
			if(c[0] != 0){
				System.out.print("overflow");
			}else{
				int f = 80 - cl;
				if(c[f] != 0)f--;
				for(int j = f + 1;j <= 80;j++){
					System.out.print(c[j]);
				}
			}
			System.out.println();
		}
		System.exit(0);
	}

}