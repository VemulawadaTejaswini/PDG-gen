import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;
			int s = 0;
			for(int i=1;i<=(int)Math.sqrt(n);i++) {
				if(n%i == 0) {
					s += i;
					if(n/i>i) s += n/i;
				}
				
			}
			s -= n;
			if(s==n) {
				System.out.println("perfect number");
			}else if(s<n) {
				System.out.println("deficient number");
			}else {
				System.out.println("abundant number");
			}
		}
	}
}
