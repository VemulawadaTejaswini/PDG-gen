import java.util.Scanner;
class Main {
	int max = -1000000,min = 1000000;
	public void min() {
		Scanner sc = new Scanner(System.in);
		long sum = 0;
		int n = sc.nextInt();
		if(n == 0) {
			max = 0;
			min = 0;
		} else if (n == 1) {
			int ai = sc.nextInt();
				max = ai;
				min = ai;
				sum += ai;
		} else {
			for(int I = 1; I <= n; I++) {
				int ai = sc.nextInt();
				if(ai > max) {
					max = ai;
					if(ai < min) {
						min = ai;
					}
				} else if(ai < min) {
					min = ai;
					if(ai > max) {
						max = ai;
					}
				}
				sum += ai;
			}
		}
		System.out.println(min + " " + max + " " + sum);
	}
	public static void main(String[] args) {
		new Main().min();
	}
}