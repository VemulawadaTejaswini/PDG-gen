import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			count = 0;
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			if(num1 == 0 && num2 == 0) {
				break;
			} else {
				for(int i = 1;i <= num1; i++){
					for(int j = i + 1;j <= num1;j++){
						for(int y = j + 1;y <= num1;y++){
							if(i + j + y == num2) {
								count++;
							}
						}
					}
				}
				System.out.println(count);
			}
		}





	}
}