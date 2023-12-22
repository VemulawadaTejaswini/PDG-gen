import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] L = new int[N];
		for(int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}
		sc.close();
		
		int count = 1;
		int distance = 0;
		for(int i = 0; i < N; i++) {
			distance += L[i];
			if(distance <= X) {
				count++;
				continue;
			}else {
				break;
			}
		}
		System.out.println(count);
	}
}