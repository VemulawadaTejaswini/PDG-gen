import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int limitHeight = sc.nextInt();
		int result = 0;
		
		for(int i = 0; i < num; i++) {
			if(limitHeight <= sc.nextInt() ) {
				result++;
			}
		}

		System.out.println(result);
		sc.close();
	}
}
