import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[]args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			int num = scanner.nextInt();
			if(num == 0){
				break;
			}
			if(999 < num){
				System.out.println(divide1000(num) + divide100(num) + divide10(num) + divide1(num));
			} else if(99 < num && num <= 999){
				System.out.println(divide100(num) + divide10(num) + divide1(num));
			} else if(9 < num && num <= 99){
				System.out.println(divide10(num) + divide1(num));
			} else {
				System.out.println(divide1(num));
			}
	}
	}
	static int divide1000(int num){
	return num / 1000;
	}
	static int divide100(int num){
	return (num % 1000) / 100;
	}
	static int divide10(int num){
	return (num % 100) / 10;
	}
	static int divide1(int num){
	return (num % 10) / 1;
	}
}