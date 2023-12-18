import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int N = sc.nextInt(); //問題数
		int M = sc.nextInt(); //回答数

		boolean[] bool = new boolean[N];
		int[]  miss= new int[N]; //間違った回数

		for(int i=0; i<N; i++) {
			bool[i] = false;
			miss[i] = 0;
		}
		for(int i = 0; i<M; i++) {
			//添え字を選択させる。
			int no = sc.nextInt()-1;
			String anser = sc.next();
			if(bool[no]) {
				continue;
			}else {
				if(anser.equals("AC")) {
					bool[no] = true;
				}else {
					miss[no]++;
				}
			}
		}
		int win = 0;
		int lose = 0;

		for(int i = 0; i<N; i++) {
			if(bool[i]) {
				win++;
				lose += miss[i];
			}
		}
		System.out.println(win + " " + lose);

	}

}
