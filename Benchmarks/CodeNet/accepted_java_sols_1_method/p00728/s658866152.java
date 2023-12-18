import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0)
				break;
			int max = 0;
			int min = 1000;
			int ave = 0;
			int[] num = new int[n];

			for(int i = 0; i < num.length; i++) {
				num[i] = sc.nextInt();
				ave += num[i];

				if(num[i] > max)
					max = num[i];
				if(num[i] < min)
					min = num[i];
			}

			ave -= (max + min);
			ave /= n - 2;
			System.out.println(ave);
		}
	}
}