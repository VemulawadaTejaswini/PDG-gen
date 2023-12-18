import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int i;

		for(i=1; i<=n; i++){
			if(i > n) break;
			String x = String.valueOf(i);
			if (((i%3) == 0) || ((i%10) == 3) || ((i/10) == 3)) {
				System.out.print(" " + i);
			}
			else if (x.contains("3")) {
				System.out.print(" " + i);
			}
				
		}
		System.out.println();
	}

}