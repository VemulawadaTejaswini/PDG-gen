import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int col;
		
		while(n != 0) {
			int[] number = new int[n];
			col = Integer.MAX_VALUE;
			
			for(int i = 0; i < n; i++) {
				number[i] = scanner.nextInt();
			}
			Arrays.sort(number);
			
			int count;
			for(int i = 0; i < n; i++) {
				count = 1;	
				int ref = number[i];
				for(int j = i + 1; j < n; j++) {
					if (number[j] == ref) {
						count++;
					} else { 
						i = j - 1;
						break;
					}
				}
				if (count > n / 2) {
					col = ref;
					break;
				}
			}
			
			if (col == Integer.MAX_VALUE) {
				System.out.println("NO COLOR");
			} else {
				System.out.println(col);
			}
			n = scanner.nextInt();
		}
	}

}