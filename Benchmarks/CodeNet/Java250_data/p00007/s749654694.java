import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double debt = 100000;
		int N = in.nextInt();
		for(int i=0;i<N;i++){
			debt = Math.ceil(debt*1.05/1000)*1000;
		}
		System.out.printf("%.0f\n",debt);
	}
}