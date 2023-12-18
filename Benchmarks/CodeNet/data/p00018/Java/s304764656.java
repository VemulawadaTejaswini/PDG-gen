import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int[] x = new int[5];
  while (in.hasNext()) {
	for (int i = 0; i < x.length; i++) {
	  x[i] = in.nextInt();
	}
	swap(x, 0, 1);
	swap(x, 3, 4);
	swap(x, 0, 3);
	swap(x, 1, 4);
	swap(x, 0, 2);
	swap(x, 2, 4);
	swap(x, 1, 3);
	swap(x, 2, 3);
	swap(x, 1, 2);

	System.out.println(Arrays.toString(x));
  }
}

private static void swap(int x[], int a, int b) {
  if (x[a] < x[b]) {
	int t = x[a];
	x[a] = x[b];
	x[b] = t;
  }
}
}