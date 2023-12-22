import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int[] a = new int[4];
  while (in.hasNext()) {
	for (int i = 0; i < a.length; i++) {
	  a[i] = in.nextInt();
	}
	int hit = 0;
	int blow = 0;
	for (int i = 0; i < 4; i++) {
	  int num = in.nextInt();
	  for (int j = 0; j < a.length; j++) {
		if (a[j] == num) {
		  if (i == j) {
			hit++;
		  } else {
			blow++;
		  }
		}
	  }
	}
	System.out.println(hit + " " + blow);
  }
}
}