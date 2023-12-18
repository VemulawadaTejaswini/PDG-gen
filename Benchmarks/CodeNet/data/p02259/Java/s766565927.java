import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int a  = number.nextInt();
		int[] b = new int[a];
		int c = 0,count = 0;
		double d;

		for(int i = 0;i < a;i++) {
			b[i] = number.nextInt();
		}
		for(int i = 0;i < b.length - 1;i++) {
			for(int j = 0;j < a - 1;j++) {
				if(j + 1 > b.length) break;
				if(b[j] > b[j + 1]) {
					c = b[j];
					b[j] = b[j + 1];
					b[j + 1] = c;
					count++;
				}
				
				
			}
			
			a--;
		}
		for(int i = 0;i < b.length;i++) {
			System.out.print(b[i]);
			if(i != b.length - 1) System.out.print(" ");
			else System.out.println("");
		}
		System.out.println(count);
	}
}

