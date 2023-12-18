import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int sum=0,count=0;
		for(int i=0;i<=a;i++) {
			if(x<i*500) break;
			for(int j=0;j<=b;j++) {
				if(i*500+j*100>x)break;
				for(int k=0;k<=c;k++) {
					if(i*500+j*100+k*50>x) break;
					if(i*500+j*100+k*50==x) {
						count++;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
}
