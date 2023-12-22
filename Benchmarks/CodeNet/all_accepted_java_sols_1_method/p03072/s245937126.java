import java.lang.Math;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
      	final int N = scanner.nextInt();
      	int count = 0;
		int max = 0;
      	for (int i = 0; i < N; i++) {
        	final int h = scanner.nextInt();
          	if (h >= max) {
            	count++;
              	max = h;
            }
        }

       	System.out.println(count);
    }
}