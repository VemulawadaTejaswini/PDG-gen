import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		int flag=0;
		if(x==2) {
			System.out.println(2);
			System.exit(0);
		}
		if(x%2==0) {
			for(long i=x+1;;i+=2) {
				for(long j=3;j<Math.sqrt(i);j++) {
					flag=0;
					if(i%j==0) {
						flag=1;
						break;
					}
				}
				if(flag==0) {
					System.out.println(i);
					break;
				}
			}
		}else {
			for(long i=x;;i+=2) {
				for(long j=3;j<Math.sqrt(i);j++) {
					flag=0;
					if(i%j==0) {
						flag=1;
						break;
					}
				}
				if(flag==0) {
					System.out.println(i);
					break;
				}
			}
		}
	}

	public static long f(long n) {
		if(n%5!=0) {
			return 0;
		}else{
			return 1+f(n/5);
		}
	}
}


