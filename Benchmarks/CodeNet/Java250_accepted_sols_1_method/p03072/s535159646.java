import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int count = 1;
		int max = sc.nextInt();

		for(int i = 0; i < n-1; i++){
			int hotel = sc.nextInt();
			if(hotel >= max) {
				count++;
				max = hotel;
			}
		}

		System.out.println(count);
	}
}