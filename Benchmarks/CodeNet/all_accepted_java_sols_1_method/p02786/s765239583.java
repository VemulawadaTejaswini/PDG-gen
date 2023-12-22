import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long tairyoku = Long.parseLong(sc.next());
		long kobetsuTairyoku = tairyoku;
		long count = 0;
		while(kobetsuTairyoku > 1) {
			kobetsuTairyoku = kobetsuTairyoku/2;
			count++;
		}
		long sumCount = 0;
		for(int i=0; i<=count; i++) {
			sumCount = (long) (sumCount + Math.pow(2, i));
		}
		System.out.println(sumCount);

	}

}