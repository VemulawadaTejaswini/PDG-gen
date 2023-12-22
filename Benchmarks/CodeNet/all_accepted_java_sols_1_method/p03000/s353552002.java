import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), X = sc.nextInt();
		int sum = 0;
		int Count = 1;
		for(int i = 0; i < N; i++) {
			sum += sc.nextInt();
			if(sum > X) {
				break;
			}else {
				Count++;
			}
		}
		System.out.println(Count);
	}
}
