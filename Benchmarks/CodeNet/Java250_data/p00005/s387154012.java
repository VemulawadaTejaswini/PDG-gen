import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while( scan.hasNextInt() ) {
			Integer[] ary = new Integer[2];
			ary[0] = scan.nextInt();
			ary[1] = scan.nextInt();
			
			Arrays.sort(ary);
			
			int divisor = 0, temp = 0;
			long multiple = 0;
			
			if(ary[0] != 0) {
				int m = ary[1];
				int n = ary[0];
				
				while(true) {
					if(m % n != 0) {
						temp = n;
						n = m % n;
						m = temp;
					}
					
					else if(m % n == 0){
						divisor = n;
						break;
					}
				}
			}
			
			else {
				divisor = ary[1];
			}
			
			multiple = (ary[0] * (long)ary[1]) / divisor;
			
			
			System.out.println(divisor + " " + multiple);
		}
	}
}