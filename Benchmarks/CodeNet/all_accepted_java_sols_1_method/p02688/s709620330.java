import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int k = scan.nextInt();

	int re=0;

		int[] array = new int[n];

		for(int i=0;i<k;i++) {

			int d = scan.nextInt();

			for(int j=0;j<d;j++) {
				int idx = scan.nextInt();
				array[idx-1]+=1;
			}
		}

		for(int i:array) {
			if(i == 0)
				re++;
		}
		System.out.println(re);
	}

}
