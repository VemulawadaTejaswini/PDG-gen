import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int p_min = Integer.MAX_VALUE;
		for(int i = 0; i < 3; i++){
			p_min = Math.min(p_min, sc.nextInt());
		}

		int d_min = Integer.MAX_VALUE;
		for(int i = 0; i < 2; i++){
			d_min = Math.min(d_min, sc.nextInt());
		}

		System.out.println((p_min + d_min - 50));
	}

}
