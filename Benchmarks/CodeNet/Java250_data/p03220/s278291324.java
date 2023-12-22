import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		int H[]= new int[N];
		double Max = Integer.MAX_VALUE;
		int answer = 0;
		for(int i=0; i<N; i++) {
			H[i] = sc.nextInt(); //N個の標高の入力
			double ave = T - H[i] * 0.006; //平均気温
			if(Max>Math.abs(A-ave)) {
				Max = Math.abs(A-ave);
				answer = i+1;
			}
		}
		System.out.println(answer);
		
	}
}