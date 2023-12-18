import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int num1, num2;
			while((num1 = sc.nextInt()) != 0 && (num2 = sc.nextInt()) != 0){
				for(int i = 0; i < num1; i++){
					for(int j = 0; j < num2; j++){
						System.out.print('#');
					}
					System.out.println();
				}
			}
		}
	}
}