import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int x, sum;
		int data_cal[];
		String charc;
		
		do {
			
			x = scan.nextInt();
			
			if(x == 0)break;
			
			sum = 0;
			data_cal = new int[x];
			charc = String.valueOf(x);
			
			for(int i = 0; i < charc.length(); i++) {
				char c = charc.charAt(i);
				data_cal[i] = (int)c;
				sum += data_cal[i] - 48;
			}
			
			System.out.println(sum);
			
		}while(true);
	}
}
