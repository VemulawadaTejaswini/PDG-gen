import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] inputs = new int[3];
		inputs[0] = scanner.nextInt();
		inputs[1] = scanner.nextInt();
		inputs[2] = scanner.nextInt();
		scanner.close();
		
		int count5 = 0;
		int count7 = 0;
		for(int input: inputs) {
			if(input == 5) {
				count5++;
			} else if(input == 7) {
				count7++;
			} else {
				break;
			}
		}
		if(count5 == 2 && count7 == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");			
		}
	}
}
