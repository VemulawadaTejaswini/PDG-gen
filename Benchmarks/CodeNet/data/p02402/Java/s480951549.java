import java.util.Scanner;
class Main{
	int max = -1000000,min = 1000000;
	public void min() {
		Scanner sc = new Scanner(System.in);
		long X = 0;
		int n = sc.nextInt();
		if(n != 0) {
			for(int I = 1; I <= n; I++) {
				int ai = sc.nextInt();
				if(max < ai) {
					max = ai;
				} else if( min > ai) {
					min = ai;
				}
				X = X + ai;
			}
		} else {
			max = n;
			min = n;
		}
		System.out.println(min + " " + max + " " + X);
	}
	public static void main(String[] args) {
		new Main().min();
	} 
}