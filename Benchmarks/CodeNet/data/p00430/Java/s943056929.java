import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	private void run(){
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		while (number != 0) {
			int[] string = new int[number];
			for (int i = 0; i < number; i++) {
				string[i] = 0;
			}
			string[0] = number;
			System.out.println(string[0]);
			int digit = decrease(string, number);
			while (digit != number) {
				for (int i = 0; i <= digit; i++) {
					System.out.print(string[i]);
					if (i != digit) {
						System.out.print(" ");
					}else {
						System.out.println();
					}
				}
				digit = decrease(string, number);
			}
			
			number = scan.nextInt();
		}
	}
	
	private int decrease(int[] string, int number){
		for (int i = number - 1; i >= 0; i--) {
			if (string[i] > 1) {
				string[i]--;
				if (string[i] == 1) {
					int digit = 0;
					for (int j = 0; j < number; j++) {
						if (string[j] == 0) {
							string[j] = 1;
							digit = j;
							break;
						}
					}
					return digit;
				}else {
					int sum;
					int end = i;
					do {
						sum = 0;
						for (int j = 0; j < end+1; j++) {
							sum += string[j];
						}
						if (sum < number) {
							if (number - sum > string[end]) {
								string[end + 1] = string[end];
							}else {
								string[end + 1] = number - sum;
							}
						}
						end++;
					}while (sum != number);
					for (int p = end; p < number; p++) {
						string[p] = 0;
					}
					return end-1;
				}
			}
		}
		return number;
	}

}