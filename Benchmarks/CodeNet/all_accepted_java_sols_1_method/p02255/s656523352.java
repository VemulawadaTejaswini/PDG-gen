import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	StringBuilder sb = new StringBuilder();
	int n = in.nextInt();
	Integer[] a = new Integer[n];
	for (int i = 0; i < n; i++) {
	    a[i] = in.nextInt();
	}
	for (int i = 0; i < n; i++) {
	    int v = a[i];
	    int j = i - 1;
	    while (j >= 0 && a[j] > v) {
		a[j + 1] = a[j];
		j--;
	    }
	    a[j + 1] = v;
	    sb.setLength(0);
	    for (int k = 0; k < n; k++) {
		sb.append(a[k]);
		sb.append(" ");
	    }
	    System.out.println(sb.toString().trim());
	}

    }
}

