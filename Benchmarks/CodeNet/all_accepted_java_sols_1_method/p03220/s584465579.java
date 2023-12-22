import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t = scan.nextInt();
		int a = scan.nextInt();
		int h[]= new int [n];
		for(int i=0;i<n;i++) {
			h[i]=scan.nextInt();
		}
		scan.close();
		double min =Integer.MAX_VALUE;
		int num=0;
		for(int i=0;i<n;i++) {
			if(Math.abs(a-( t-h[i]*0.006)) < min ) {
				min =Math.abs(a-( t-h[i]*0.006));
				num=i+1;
			}
		}
		System.out.println(num);
	}
}