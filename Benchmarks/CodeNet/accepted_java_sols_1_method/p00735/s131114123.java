import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n==1) break;
			boolean [] ms = new boolean[n+1];
			for(int i=2;i<=n/2;i++) {
				if(!ms[i]) {
					if(n%i == 0 && (i%7 == 1 || i%7 == 6)){
						ms[i] = true;
						for(int j = 2*i;j<=n;j += i) {
							ms[j] = true;
						}
					}
				}else {
					ms[i] = false;
				}
			}
			System.out.print(n+":");
			for(int i=2;i<=n/2;i++) {
				if(ms[i]) {
					System.out.print(" "+i);
				}
			}
			if(!ms[n]) {
				System.out.print(" "+n);
			}
			System.out.println();
		}
	}
}

