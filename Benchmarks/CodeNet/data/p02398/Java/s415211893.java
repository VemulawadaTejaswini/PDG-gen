import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i =1 ; i <= b ; i++){
			
			if ( (c % i == 0) && (b >= i) ){
				sum1++;
			}
			if ( (c % i == 0) && (a > i) ){
				sum2++;
			}
		}
		System.out.println(sum1 - sum2);

	}

}
