import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];

        int i = 0;
		while(i < N) {
			x[i] = sc.nextInt();
			i++;
		}

		int min = 101;
		int max = -1;
		for(int j = 0; j < N ; j++) {
			if(x[j] <min) {
				min = x[j];
			}
			if(x[j] >max) {
				max = x[j];
			}
		}

		int minPower=0;

		for(i = min; i <= max; i++) {
			int power = 0;
			for(int j = 0; j < N ; j++) {
				power += (i-x[j])*(i-x[j]);
			}
			if(i == min || (i != min && minPower > power)) {
				minPower = power;
			}
		}

		System.out.println(minPower);
	}

}
