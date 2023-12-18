import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int i,j;
		int[] list = new int[n];

		for(i=0;i<n;i++) {
			list[i]=scan.nextInt();
		}
		for(j=0;j<=list.length;j++) {
			if(j==1) {
				System.out.print(list[list.length-j]);
			}else {
				System.out.print(" "+list[list.length-j]);
			}
		}
		System.out.println();
		scan.close();
	}
}

