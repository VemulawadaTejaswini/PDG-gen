import java.util.Scanner;

public class Main {
	static class Worker {
		int number;
		long result;
		boolean mark;

		Worker (int number, long result) {
			this.number = number;
			this.result = result;
			this.mark = false;
		}

		public void add(long result) {
			this.result += result;
		}
		
		public void mark() {
			if (1000000L <= this.result) {
				this.mark = true;
			}
		}
	}

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		Worker worker[];
		int index;
		boolean flag, flag2;

		n = sc.nextInt();
		while (n != 0) {
			worker = new Worker[n];
			index = 0;
			for (int i = 0; i < n; i++) {
				int number = sc.nextInt();
				int cost = sc.nextInt();
				int lots = sc.nextInt();
				flag = true;
				for (int j = 0; j < index; j++) {
					if (worker[j].number == number) {
						worker[j].add(cost * lots);
						worker[j].mark();
						flag = false;
					}
				}
				if (flag) {
					worker[index] = new Worker(number, cost * lots);
					worker[index].mark();
					index++;
				}
			}
			flag2 = true;
			for (int i = 0; i < index; i++) {
				if (worker[i].mark) {
					System.out.println(worker[i].number);
					flag2 = false;
				}
			}
			if (flag2) {
				System.out.println("NA");
			}

			n = sc.nextInt();
		}
	}
}