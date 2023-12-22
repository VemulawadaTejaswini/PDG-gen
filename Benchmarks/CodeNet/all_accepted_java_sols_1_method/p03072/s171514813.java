import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	
	Scanner stdIn = new Scanner(System.in);
	
	int n = stdIn.nextInt();
	int[] h = new int[n];
	int max;
	int count = 1;
	for (int i = 0; i < n; i++) {
		h[i] = stdIn.nextInt();
	}
	
	max = h[0];
	
	for (int i = 1; i < n; i++) {
		if (h[i] >= max) {
			max = h[i];
			count++;
		}
	}
	
	System.out.println(count);
	
	}
}