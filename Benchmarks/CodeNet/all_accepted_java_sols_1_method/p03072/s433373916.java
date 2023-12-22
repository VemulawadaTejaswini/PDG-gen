import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int highest = 0;
		int count = 0;
		
		for(int i = 0; i < num; i++) {
			int heigh = sc.nextInt();
			if (highest <= heigh) {
				highest = heigh;
				count++;				
			}
		}
		
		System.out.print(count);
	}	
}