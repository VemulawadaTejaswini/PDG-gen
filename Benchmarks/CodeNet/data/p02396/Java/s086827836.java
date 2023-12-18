import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		int[] nums = new int[10000];

		do {

			Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();

	        if (x == 0) {
	        	sc.close();
	        	break;
	        }else {
	        	nums[i] = x;
	        }

		}while(true);

		for (int j = 0; nums[j] > 0; j++) {
			System.out.println( "Case "+ j +":"+" "+ nums[j] );

		}

	}

}
