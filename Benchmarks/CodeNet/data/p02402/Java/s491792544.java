import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, max = -10000000, min = 10000000, sum = 0;
		int a = sc.nextInt();
		int b[] = new int[a];

		for(i = 0; i < a; i++){
			int c = sc.nextInt();
			b[i] = c;
		}
		for(i = 0; i < a; i++){
			if(b[i] >= max) max = b[i];
		}
		for(i = 0; i < a; i++){
			if(b[i] <= min) min = b[i];
		}
		for(i = 0; i < a; i++){
			sum += b[i];
		}
		System.out.println(min + " " + max + " " + sum);
	}
}
