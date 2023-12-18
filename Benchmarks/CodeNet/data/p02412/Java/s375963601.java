import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			int n=scan.nextInt();
			int a=scan.nextInt();
			int sum=0,count=0;
			
			for(int i=1;i<=n;i++) {
				for(int j=2;j<=n-1;j++) {
					for(int k=3;k<=n-2;k++) {
						sum = i+j+k;
						if(sum == a) {
							if(i == j || j == k || i == k) {
							}
							else
								count += 1;
						}
					}
				}
			}
			System.out.println(count);
			if(n==0 && a==0) {
				break;
			}
}
		scan.close();
}
}
