import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		Y/=1000;
		int a=-1,b=-1,c=-1,flag=0;
		for(int i=0;i<=N;i++) {
			for(int j=0;i+j<=N;j++) {
				int k = N-i-j;
				if(i*10+j*5+k==Y) {
					a=i;
					b=j;
					c=k;
					flag=1;
					break;
				}
			}
			if(flag==1) break;
		}
		System.out.printf("%d %d %d\n",a,b,c);
	}
}