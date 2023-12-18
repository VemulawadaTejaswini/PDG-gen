import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int kisu = N/2;
		int gusu = N/2;
		if(N % 2 == 1) {
			kisu += 1;
		}
			
		System.out.println(kisu * gusu);
		sc.close();
	}

}
