import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
		
		prime(num , scanner);
		
		scanner.close();
	}

	public static void prime(int num, Scanner scanner){
		int count = 0;
		int i;
		int prime_sum = 0;
		int can;
		
		while( count < num ) {
			can = scanner.nextInt();
			
			if (can == 2){
				prime_sum ++;
				System.out.println("Hit"+can);
			}else if (!(can % 2 == 0)){
				for (i = 3; i <= can; i += 2){
					if (can % i == 0){
						prime_sum ++;
						break;
					}
				}
			}
			
			
			count ++;
		}
		
		System.out.println(prime_sum);
	}
}
