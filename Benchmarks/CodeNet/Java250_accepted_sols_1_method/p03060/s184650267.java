import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* A問題
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();

        int cntBiscuit = 0;

        int time = A;

        for(int i = 2 ; time <= T ; i++) {
        	time = A * i;

        	cntBiscuit += B;
        }

        System.out.println(String.valueOf(cntBiscuit));
        */

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] intValue = new int[N];
		for(int i = 0 ; i<N ; i++) {
			intValue[i] = sc.nextInt();
		}

		int[] intCost = new int[N];
		for(int i = 0 ; i<N ; i++) {
			intCost[i] = sc.nextInt();
		}

		int maxValue = 0;

		for(int i = 0 ; i < N ; i++) {
			if (intValue[i] > intCost[i]) {
				maxValue += intValue[i] - intCost[i];
			}
		}

		System.out.println(String.valueOf(maxValue));
	}

}