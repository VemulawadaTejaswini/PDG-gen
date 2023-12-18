import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int n;
	private int[] a;

	public void mainrun() {
		scan = new Scanner(System.in);

		n = scan.nextInt();
		a = new int[n];

		for(int i = 0;i < n ; i++) {
			a[i] = scan.nextInt();
		}

		printElement();

		for(int i = 1;i < n;i++) {
			looprun(i);
		}
	}

	public void looprun(int index) {
		int v = a[index];

		int j = index - 1;

		while(j >= 0 && a[j] > v) {
			a[j + 1] = a[j];
			j--;
		}

		a[j + 1] = v;

		printElement();
	}

	private void printElement() {
		String str = Integer.toString(a[0]);

		for(int i = 1;i < n;i++) {
			str += " " + Integer.toString(a[i]);
		}

		System.out.println(str);
	}
}
