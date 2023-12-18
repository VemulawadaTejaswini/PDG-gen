import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int n[] = new int[5];
		int count = 0;
		int temp = 0;

		for(int i = A; i <= B; i++) {
			temp = i;
			for(int j = 0; j < 5; j++) {
				n[j] = temp % 10;
				temp = temp / 10;
			}

			if(n[0]==n[4] && n[1]==n[3]) {
				count++;
			}
		}

		System.out.println(count);
	}

}