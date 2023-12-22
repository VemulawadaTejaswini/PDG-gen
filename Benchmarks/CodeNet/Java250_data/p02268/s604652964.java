import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	String[] inputS = scan.nextLine().split(" ");
	int q = Integer.parseInt(scan.nextLine());
	String[] inputT = scan.nextLine().split(" ");
	int[] s = new int[n];
	int[] t = new int[q];
	for (int i = 0; i < n; i++) {
	    s[i] = Integer.parseInt(inputS[i]);
	}
	for (int i = 0; i < q; i++) {
	    t[i] = Integer.parseInt(inputT[i]);
	}

	int cnt = 0;
	int high, low, j;
	for (int i = 0; i < q; i++) {
	    int key = t[i];
	    high = n - 1;
	    low = 0;
	    while (true) {
		if (high < low) {
		    break;
		}
		j = (high + low) / 2;
		if (s[j] == key) {
		    cnt++;
		    break;
		} else if (s[j] < key) {
		    low = j + 1;
		} else if (s[j] > key) {
		    high = j - 1;
		}
	    }
	}
	System.out.println(cnt);
    }
}