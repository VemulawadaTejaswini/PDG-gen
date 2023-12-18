import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int min = 1000001, max = -1000001, n;
		long sum = 0;
		
		do {
			n = stdIn.nextInt();
		}while( n < 0 || n > 10000);
		
		int data[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			do {
				data[i] = stdIn.nextInt();						
			}while( data[i] < -1000000 || data[i] > 1000000);
			
			
			if(min > data[i]) {
				min = data[i];
			}
			
			if(max < data[i]) {
				max = data[i];
			}
			
			sum += data[i];
			
		}
		

		
		System.out.println(min + " " + max + " " + sum);
		
	}
}

