import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = 4;
	int[] a = new int[n];
	int[] b = new int[n];
	int hit, blow;
	String[] inputA, inputB;
	while (scan.hasNext()) {
	    inputA = scan.nextLine().split(" ");
	    inputB = scan.nextLine().split(" ");
	    for (int i = 0; i < n; i++) {
		a[i] = Integer.parseInt(inputA[i]);
		b[i] = Integer.parseInt(inputB[i]);
	    }
	    hit = 0;
	    blow = 0;
	    for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
		    if (b[i] == a[j]) {
			if (i ==j) {
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