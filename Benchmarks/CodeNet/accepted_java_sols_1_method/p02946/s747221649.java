import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt()-1;
		int x = sc.nextInt();
		int upper = x+k;
		int lower = x-k;
		for(int i = lower;i<=upper;i++) {
			System.out.printf("%d ",i);
		}

	}

}
