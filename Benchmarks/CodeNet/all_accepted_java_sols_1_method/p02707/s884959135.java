import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] array = new int[200010];
		int[] count = new int[200010];

		for(int i =2;i<=n;i++) {

			array[i] = scan.nextInt();
		}

		for(int i=2;i<=n;i++) {
			count[array[i]]++;
		}


		for(int i=1;i<=n;i++) {
		System.out.println(count[i]);
		}
		scan.close();

	}

}
