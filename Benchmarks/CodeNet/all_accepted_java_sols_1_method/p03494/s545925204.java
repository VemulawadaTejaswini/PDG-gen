import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int flg = 0;
		int count = 0;

		int data[] = new int[n];

		for(int i = 0;i<n ; i++) {
			data[i] = scanner.nextInt();
		}

		while(flg == 0) {
			for(int i=0;i<n;i++) {
				if(data[i]%2 == 0)
					data[i]/=2;
				else flg = 1;
			}
			count ++;
		}

		System.out.println(count-1);

		scanner.close();

	}
}