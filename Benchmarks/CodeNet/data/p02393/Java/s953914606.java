import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int[] a = new int[3];
	for (int i = 0; i < a.length; i++) {
	    a[i] = sc.nextInt();
	}
	if (a[0] > a[1]) {
	    int buf = a[0];
	    a[0] = a[1];
	    a[1] = buf;
	}
	if (a[1] > a[2]) {
	    int buf = a[1];
	    a[1] = a[2];
	    a[2] = buf;
	}
	if (a[0] > a[1]) {
	    int buf = a[0];
	    a[0] = a[1];
	    a[1] = buf;
	}
	System.out.println(a[0] + " " + a[1] + " " + a[2]);
    }
}