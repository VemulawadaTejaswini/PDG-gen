import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int x[]=new int[n];
		for(int i=0;i<n;i++) {
			x[i]=scan.nextInt();
		}
		for(int i=n-1;i>0;i--) {

			System.out.print(x[i]+" ");
		}
		System.out.println(x[0]);
		scan.close();
	}

}
