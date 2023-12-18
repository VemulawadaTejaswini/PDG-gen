import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			if(num1 == 0 && num2 == 0) {
				break;
			} else {
				for(int i = 0;i < num1; i++){
					for(int j = i ;j < num1 ;j++) {
						for(int y = i + 1;y < num1;y++) {
							if(i != j && j != y && i + j + y == num2) {
								count++;
							}
						}
					}
				}
			}
		}
		System.out.println(count);




	}
}