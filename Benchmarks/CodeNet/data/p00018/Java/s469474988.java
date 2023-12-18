import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	String[] input = scan.nextLine().split(" ");
	int[] a = new int[5];
	for (int i = 0; i < 5; i++) {
	    a[i] = Integer.parseInt(input[i]);
	}
	for (int i = 0; i < 5; i++) {
	    int key = i;
	    for (int j = i+1; j < 5; j++) {
		if (a[key] < a[j]) {
		    key = j;
		}
	    }
	    int tmp = a[key];
	    a[key] = a[i];
	    a[i] = tmp;
	}
	for (int i = 0; i < 4; i++) {
	    System.out.print(a[i] + " ");
	}
	System.out.println(a[4]);
    }
}