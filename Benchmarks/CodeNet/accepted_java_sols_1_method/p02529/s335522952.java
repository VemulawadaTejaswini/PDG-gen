import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int[] s = new int[n];
	for(int i = 0; i < n; ++i) {
	    s[i] = scan.nextInt();
	}

	int q = scan.nextInt();
	int ans = 0;
	for(int i = 0; i < q; ++i) {
	    int t = scan.nextInt();
	    for(int j = 0; j < n; ++j) {
		if(t == s[j]) {
		    ++ans;
		    break;
		}
	    }
	}

	System.out.println(ans);
    }
}