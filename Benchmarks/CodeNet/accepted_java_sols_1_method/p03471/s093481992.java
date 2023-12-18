import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();

		int othousand = -1;
		int fthousand = -1;
		int tthousand = -1;

		for(int i=0; i<n+1; i++) {
			for(int j=0; j<n-i+1; j++) {
				if(10000*i+5000*j+1000*(n-i-j)==y) {
					tthousand=i;
					fthousand=j;
					othousand=(n-i-j);
				}
			}
		}

		System.out.println(tthousand + " " +fthousand + " " + othousand);

	}

}
