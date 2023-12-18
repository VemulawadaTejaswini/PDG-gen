import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long min=10000000,max=-1000000,sum=0;
		int n=scan.nextInt();
		int a[]=new int[10000];
		int x;
			for(x=0;x<n;x++) {
				int i=scan.nextInt();
				a[x]=i;
			}
				for(x=0;x<n;x++) {
					if(a[x]<min) {
						min=a[x];
					}if(a[x]>max) {
						max=a[x];
					}
					sum +=a[x];
					}
			System.out.printf("%d %d %d\n",min,max,sum);
		scan.close();
}
}
