import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int data[] = new int[n];
		int min, mini = 0, count = 0, a;
		
		for (int i = 0; i < n; i++) {
			data[i] = scan.nextInt();
		}
		scan.close();
		
		for (int i = 0; i < n - 1; i++) {
			min = data[i];
			for (int j = i + 1; j < n; j++) {
				if (min > data[j]) {
					min = data[j];
					mini = j;
				}
			}
			
			if (min != data[i]) {
				for (int k = mini; k > i; k--) {
					a = data[k - 1];
					data[k - 1] = data[k];
					data[k] = a;
					count++;
				}
			}	
		}
		
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

