import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
        	array[i] = scanner.nextInt();
        }

        calc:
        for (int i = 0; i < 1000000000; i++) {
        	for (int j = 0; j < N; j++) {
        		if (array[j] % 2 == 0) {
        			array[j] /= 2;
        		} else {
        			break calc;
        		}
        	}
        	count++;
        }

        System.out.println(count);
	}

}