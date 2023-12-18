import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		double AA = 0;
		for(int i = 0;i < N;i++) {
			long a = scn.nextLong();
			AA += 1/(double)(a);
		}
		System.out.println(1/AA);
	}

}
