import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		scan.close();
		int check=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				if(a[i]%3!=0 && a[i]%5!=0) {
					check=1;
					break;
				}
			}
		}
		System.out.println((check==1)? "DENIED":"APPROVED");

	}
}