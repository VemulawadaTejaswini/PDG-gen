import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int j = 1;
		int Count = N;
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if(j == x) {
				j++;
				Count--;
			}
		}
		if(Count == N) {
			System.out.println(-1);
		}else{
			System.out.println(Count);
		}
	}
}
