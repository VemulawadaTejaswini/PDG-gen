import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value[] = new int[10000];
		int i = 0;

		while(1){
			value[i] = scan.nextInt();
			if (value[i] == 0)
				break;
			System.out.printf("Case %d: %d\n", ++i, value[i]);
		}
	}
}