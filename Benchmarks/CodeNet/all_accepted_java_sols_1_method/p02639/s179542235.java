import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			for(int i = 0; i < 5; i++) {
				int a = sc.nextInt();
				if(a == 0) {
					System.out.println(i+1);
				}
			}
			


		}catch(Exception e) {
			e.printStackTrace();

		}

	}
}