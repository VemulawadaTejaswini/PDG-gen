import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=a.length;i>0;i--) {
			if(i!=a.length) {
				System.out.printf(" ");
			}
			System.out.printf("%d",a[i]);
		}
		System.out.printf("\n");
		
	}
}
