import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int maisu=sc.nextInt();
		long sum=sc.nextLong();
		long kei=0;
		for(int i=0; i<=maisu; i++) {
			for(int j=0; j<=maisu-i; j++) {
				kei=i*1000+j*5000+(maisu-i-j)*10000;
				if(kei==sum) {
					System.out.println((maisu-i-j)+" "+j+" "+i);
					System.exit(0);
				}
			}
		}
		System.out.println("-1 -1 -1");
	}
}