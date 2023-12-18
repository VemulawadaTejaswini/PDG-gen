import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		BulbList Lights = new BulbList(N);
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			Lights.list[i] = new Bulb(A);
		}
		sc.close();

		for (int i = 0; i < K; i++) {
			Lights.process();
		}
		for (int i = 0; i < N; i++) {
			System.out.print(Lights.list[i].power + (i != N - 1 ? " " : "\n"));
		}
	}
}

class BulbList {
	Bulb[] list;
	int N;

	BulbList(int N){
		this.N = N;
		this.list = new Bulb[N];
	}

	void process() {
		for (int i = 0; i < N; i++) {
			int max = N - 1;
			int min = 0;
			if (i + list[i].power < max) {
				max = i + list[i].power;
			}
			if (i - list[i].power > min) {
				min = i - list[i].power;
			}
			for (int j = min; j <= max; i++) {
				++list[j].ilm;
			}
		}

		for (int i = 0; i < N; i++) {
			list[i].power = list[i].ilm;
			list[i].ilm = 1;
		}
	}
}

class Bulb {
	int power;
	int ilm;
	Bulb(int A) {
		this.power = A;
		ilm = 1;
	}

}
