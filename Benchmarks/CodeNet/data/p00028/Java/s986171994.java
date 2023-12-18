import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[101];
		while(sc.hasNext()) {
			int n = sc.nextInt();
			count[n]++;
		}
		int max = 0;
		for(int i=1;i<=100;i++) {
			max = Math.max(max,count[i]);
		}
		for(int i=1;i<=100;i++) {
			if (max == count[i]) {
				System.out.println(i);
			}
		}
	}

}