import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = 0;
		int count;
		
		do {
			n = input.nextInt();
			if (n == 0){
				break;
			}
			count = 0;
			while (n != 1){
				if (n % 2 == 0){
					n /= 2;
				}
				else {
					n = n * 3 + 1;
				}
				count++;
			}
			System.out.println(count);
		}while (n == 1);
	}
}