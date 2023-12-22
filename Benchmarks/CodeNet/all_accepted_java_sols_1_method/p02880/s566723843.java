import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		for(int div = 1; div < 10 ;div++){
			if(input % div == 0 && input / div < 10){
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
