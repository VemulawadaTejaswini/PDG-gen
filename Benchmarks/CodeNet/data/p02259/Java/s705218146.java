import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int data[] = new int[n];
		int min, count = 0, j = 0, a;
		boolean flg = true;
		
		for (int i = 0; i < n; i++) {
			data[i] = scan.nextInt();
		}
		scan.close();
		
		do {
			flg = false;
			
			for (int i = n - 1; j < i; i--) {
				min = data[i];
				if ( data[i] < data[i - 1]) {
					a = data[i - 1];
					data[i - 1] = data[i];
					data[i] = a;
					flg = true;
				}
				count++;
			}		
			j++;
		} while (flg);
		
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				System.out.println(data[i]);
				System.out.println(count);
			} else {
				System.out.print(data[i] + " ");
			}
		}
		
		
	}
}

