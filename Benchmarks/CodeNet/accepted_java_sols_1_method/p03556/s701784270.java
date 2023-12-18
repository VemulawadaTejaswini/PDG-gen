import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max =0;
		int i = 0;

		while(max <= n) {
			i++;
			max = i*i;
			if(max > n) {
				i--;
			}
		}

		System.out.println(i*i);
	}
}