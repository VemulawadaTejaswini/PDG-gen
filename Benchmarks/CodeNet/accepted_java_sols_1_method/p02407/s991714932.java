import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	int n;
	int[] a = new int[1000];

	Scanner scan = new Scanner(System.in);
	n = scan.nextInt();

	for(int i = 0; i < n; i ++) {
	    a[i] = scan.nextInt();
	}

	for(int i = n-1; i > 0; i--) {
	    System.out.print(a[i]+ " ");
	}
	System.out.println(a[0]);
    }
}

