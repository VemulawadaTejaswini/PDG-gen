import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] in = new int[4];
		
		for (int i = 0; i < 4; i++) in[i] = scn.nextInt();
		int n = in[3];
		
		int comb = 0;
		for (int r = 0; r*in[0] <= n; r++) {
			for (int g = 0; g*in[1] <= n-r*in[0]; g++) {
				if ( (n - r*in[0] - g*in[1])%in[2] == 0)
					comb++;
			}
		}
		
		System.out.println(comb);
		
	}

}
