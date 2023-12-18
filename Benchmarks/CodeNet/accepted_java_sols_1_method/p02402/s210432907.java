import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long  sum=0;
		int max = -1000000;
		int min = 1000000;
		
		try(Scanner sc = new Scanner (System.in)) {
			int n = sc.nextInt();

			for(int i=0;i<n;i++) {
				int x = sc.nextInt();
				if(x>max) max = x;
				if(x<min) min = x;
				sum+=x;
			}

			System.out.printf("%d %d %d\n",min,max,sum);
		}
	}
}
	
