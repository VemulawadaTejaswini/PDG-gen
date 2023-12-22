import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int goal=2001;
		int n=sc.nextInt();
		int d=sc.nextInt();
		int x=sc.nextInt();
		int a[] = new int[n];
		int num=x;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			for(int j=1;j<=d;j+=a[i]) {
				num++;
			}
		}
		
		System.out.println(num);
	}
}
