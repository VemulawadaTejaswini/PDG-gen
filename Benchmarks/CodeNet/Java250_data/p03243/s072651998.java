import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int target = 111;
		while (target < 1000){
			if(N <= target){
				break;
			}
			target = target + 111;
		}
		System.out.println(target);
	}
}
