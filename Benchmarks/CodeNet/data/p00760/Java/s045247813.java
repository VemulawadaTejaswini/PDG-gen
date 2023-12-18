import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		Scanner insert = new Scanner(System.in);
		String line = insert.nextLine();
		int nn = Integer.parseInt(line);
		for(int i = 0; i < nn; i++) {
			String line2 = insert.nextLine();
			if (line2.equals("")) {
				break;
			}
			input.add(line2);
		}
		for(String a:input) {
			int sum = 0;
			String array1[] = a.split(" ");
			int y = Integer.parseInt(array1[0]);
			int m = Integer.parseInt(array1[1]);
			int day = Integer.parseInt(array1[2]);
			int n = 1000-y;
			for(int i = 0;i < n; i++) {
				if(i % 3 == 0) {
					sum+=200;
				}
				else {
					sum+=195;
				}
			}
			if(y % 3 == 0) {
				for(int i = 1; i <= m; i++) {
					sum-=20;
				}
			}
			else {
				for(int i = 1; i <= m; i++) {
					if(i % 2 == 0) {
						sum-=19;
					}
					else {
						sum-=20;
					}
				}
			}
			if((y % 3 != 0) && (m % 2 ==0)) {
				sum+=(20-day);
			}
			else {
				sum+=(21-day);
			}
			System.out.println(sum);
		}
	}


}


