import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while((n = sc.nextInt()) != 0){
			System.out.println(getCount(n));
		}
	}
	
	private static int getCount(int n){
		int count = 0;
		int num = n;
		while(num != 1){
			if(num % 2 == 0)	num /= 2;
			else		num = num * 3 + 1;
			count++;
		}
		return count;
	}
}