import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[] = new int [100];
		int i;
			for(i=0;i<n;i++) {
			a[i] = scan.nextInt();
			}
			for(i=n-1;i>=0;i--) {
				if(n-1>i) {
					System.out.printf(" ");
				}
				System.out.printf(""+a[i]);
			}
			System.out.println();
			scan.close();
}
}
