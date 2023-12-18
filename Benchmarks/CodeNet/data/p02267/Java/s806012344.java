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
	for (int i = 0; i < q; i++) {
	    for (int j = 0; j < n; j++) {
		if (t[i] == s[j]) {
		    cnt++;
		}
	    }
	}
	System.out.println(cnt);
    }
}