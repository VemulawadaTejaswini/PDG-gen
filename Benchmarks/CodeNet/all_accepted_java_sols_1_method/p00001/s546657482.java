import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		int first = 0;
		int second = 0;
		int third = 0;
		int temp;
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			temp = input.nextInt();
			if(temp > first) {
				int temp2 = first;
				first = temp;
				temp = temp2;
				if(temp > second) {
					int temp3 = second;
					second = temp;
					temp = temp3;
					if(temp3 > third) {
						third = temp3;
					}
				}
			}
			else if(temp > second) {
				int temp3 = second;
				second = temp;
				temp = temp3;
				if(temp3 > third) {
					third = temp3;
				}
			}
			else if(temp > third) {
				third = temp;
			}
		}
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
	}

}