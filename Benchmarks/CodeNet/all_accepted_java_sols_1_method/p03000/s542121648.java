import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Input
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());

		int L[] = new int[N];
		for(int i = 0; i < N ; i++) {
			L[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		//Logic
		int answer = 1;
		int D = 0;

		for(int i = 0; i < N ; i++) {
			D = D + L[i];
			if(D <= X) {
				answer += 1;
			}else {
				break;
			}
		}

		//output
		System.out.print(answer);
	}

}
