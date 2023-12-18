import java.util.ArrayList;
import java.util.Scanner;

class Exam {
	private int a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int sum;

	Exam(int a, int b, int c, int d, int e){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.sum = this.a + this.b + this.c + this.d + this.e;
	}

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}


}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Exam> x = new ArrayList<Exam>();
		int n = 0;

			while (sc.hasNext()) {
				n = sc.nextInt();
					if (n == 0) {
						break;
					}

					for (int i = 0; i < n; i++) {
						x.add(new Exam(sc.nextInt(), sc.nextInt(),
									   sc.nextInt(), sc.nextInt(), sc.nextInt()));
					}
				sum_rank(x);
				x.clear();
			}

		sc.close();
	}

	private static void sum_rank(ArrayList<Exam> x) {
		int max = x.get(0).getSum();
		int min = x.get(0).getSum();

			for (int i = 1; i < x.size(); i++) {
				max = Math.max(max, x.get(i).getSum());
				min = Math.min(min, x.get(i).getSum());
			}

		System.out.printf("%d %d\n", max, min);
	}

}
