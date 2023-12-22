import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputN = sc.nextInt();		
		int inputH = sc.nextInt();
		
		int count = 1;
		int highest = inputH;
		
		for(int i = 0 ; i < inputN -1 ; i++) {
			inputH = sc.nextInt();
			if(inputH >= highest) {
				count++;
				highest = inputH;
			}
		}
		sc.close();
		System.out.println(count);
		
	}
}