import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fiveCount = 0;
		int sevenCount = 0;
		int total = 0;

	    int[] array = new int[3];
	    for(int i = 0; i<3; i++){
	        array[i] = sc.nextInt();
	    }

	    for(int i = 0; i < array.length; i++) {
	    	total += array[i];
	    	if(array[i] == 5) {
	    		fiveCount++;
	    	}else if(array[i] == 7) {
	    		sevenCount++;
	    	}
	    }

		if(total != 17) {
			System.out.println("NO");
		}else if(fiveCount != 2 && sevenCount != 1) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}
}
