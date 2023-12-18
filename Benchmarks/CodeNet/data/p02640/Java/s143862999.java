import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int heads = sc.nextInt();
		int legs = sc.nextInt();

		for (int i=0;i <= heads;i++) {
			if(i*2 + (heads-i)*4 == legs) {
				System.out.println("Yes");
				sc.close();
				return;
			}

		}

		sc.close();
		System.out.println("No");

	}

}