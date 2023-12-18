import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num1 = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
		int count = 0;
		for(int i = 0; i < 3; i++) {
			if(num1[i] == 5) {
				count++;
			} else if(num1[i] == 7) {
				count += 2;
			} else {
				System.out.println("NO");
				return ;
			}
		}
		System.out.println(count == 4 ? "YES" : "NO");

	}

}
