import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		int first = 0;
		int second = 0;
		int third = 0;
		int input;
		while(cin.hasNextInt()) {
			input = cin.nextInt();
			
			if(input > third) {
				if(input > second) {
					if(input > first) {
						third = second;
						second = first;
						first = input;
					} else {
						third = second;
						second = input;
					}
				} else {
					third = input;
				}
			}
		}
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}
}