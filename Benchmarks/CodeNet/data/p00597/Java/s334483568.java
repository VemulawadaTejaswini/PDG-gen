import java.util.HashMap;
import java.util.Scanner;

class Main{

	static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]){
		while(true){
			int n = scanner.nextInt();
			if(n == 0) break;

			switch(n){
			case 1:{
				System.out.println(1);
				break;
			}
			case 2:{
				System.out.println(2);
				break;
			}
			case 3:{
				System.out.println(5);
			}
			default:{
				if(n%2 == 0){
					int m = n/2 - 1;
					int result = n + m * m * 4;
					System.out.println(result);
				}else{
					int m = (n - 1)/2 - 1;
					int result = n + (n - 1) + m * m * 4;
					System.out.println(result);
				}
			}
			}
		}
	}
}