import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int[] prime=new int[1229];
		int counter=2;
		prime[0]=2;
		prime[1]=3;

		for(int i=5; i<=10000; i++) {
			for(int j=2; j*j<=i; j++) {
				if(i%j==0) {
					break;
				}
				if(i%j!=0 && (j+1)*(j+1)>i) {
					prime[counter]=i;
					counter++;
				}
			}
		}

		int[] fp=new int[205];
		int counter2=0;
		for(int i=0; i<1228; i++) {
			if(prime[i+1]-prime[i]==2) {
				fp[counter2]=prime[i];
				counter2++;
			}
		}

		while(true) {
			int a=sc.nextInt()-2;
			if(a==-2) {
				System.exit(0);
			}
			int max=0;

			for(int i=0; i<205; i++) {
				if(fp[i]<=a) {
					max=fp[i];
				}
				else if(fp[i]>a) {
					break;
				}
			}

			System.out.println(max+" "+(max+2));
		}
	}
}
