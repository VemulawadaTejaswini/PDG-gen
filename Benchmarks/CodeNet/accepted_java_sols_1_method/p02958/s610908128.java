import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] in = new int[N];

		int diff =0;
		for(int i =0;i<N;i++) {
			in[i] = scan.nextInt();
			if (i+1 == in[i]) {
				continue;
			}
			diff++;
		}
		if(diff ==0 || diff ==2) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		scan.close();
	}

}