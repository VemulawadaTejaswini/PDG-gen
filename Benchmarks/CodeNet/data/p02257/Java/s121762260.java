import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int a  = number.nextInt();
		int[] b = new int[a];
		int c = 0;
		double d;

		for(int i = 0;i < a;i++) {
			b[i] = number.nextInt();
			c++;
			d = b[i] / 2;
			for(int j =2;j < (int)b[i];j++) {
				
				if(b[i] % j == 0) {
					
					c--;
					break;
				}
			}
			
		}
		System.out.println(c);
	}
}
