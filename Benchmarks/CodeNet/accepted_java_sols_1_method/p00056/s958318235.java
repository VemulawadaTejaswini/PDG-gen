import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean[] prime=new boolean[50001];

		for(int i=0; i<=50000; i++) {
			prime[i]=false;
		}

		prime[2]=true;
		prime[3]=true;
		for(int i=5; i<=50000; i++) {
			for(int j=2; j*j<=i; j++) {
				if(i%j==0) {
					break;
				}
				if(i%j!=0 && (j+1)*(j+1)>i) {
					prime[i]=true;
				}
			}
		}
		int kotae=0;
		while(true) {
			kotae=sc.nextInt();

			if(kotae==0) {
				System.exit(0);
			}

			if(kotae%2==1) {
				if(prime[kotae-2]) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
			}
			else {
				int dec=0;
				int kosu=0;
				if(prime[kotae/2]) {
					dec=1;
				}
				for(int i=1; i<kotae; i+=2) {
					if(prime[kotae-i] && prime[i]) {
						kosu++;
					}
				}
				System.out.println(kosu/2+dec);
			}
		}
	}
/*
	public static boolean isPrime(int a) {
		if(a<4) {
			if(a==2 || a==3) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			for(int j=2; j*j<=a; j++) {
				if(a%j==0) {
					return false;
				}
				if(a%j!=0 && (j+1)*(j+1)>a) {
					return true;
				}
		}
		return true;
		}
	}*/
}
