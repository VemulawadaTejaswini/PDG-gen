import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		int n = 0;
		int x = 0;
		int countA = 0;
		
		while(true){
			n = scan.nextInt();
			x = scan.nextInt();
			int count = 0;
			if(n == 0 && x == 0){
				break;
			}
			
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					for (int k = 1; k <= n; k++) {
						if (i == j || j == k) {
							continue;
						} else if (i < j && j < k) {
							int s = i + j + k;
							if (s == x) {
								count = count + 1;
							}
						}
					}
				}
			}
			number.add(count);
			countA++;
		}
		for(int h = 0; h < countA; h++){
			System.out.println(number.get(h));
		}
	}
}