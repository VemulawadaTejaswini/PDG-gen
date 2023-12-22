import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		boolean[] can = new boolean[10];
		for (int i = 0; i < k; i++) {
		    can[sc.nextInt()] = true;
		}
		while (true) {
		    boolean flag = true;
		    int x = n;
		    while(x > 0) {
		        if (can[x % 10]) {
		            flag = false;
		            break;
		        }
		        x /= 10;
		    }
		    if (flag) {
		        System.out.println(n);
		        return;
		    }
		    n++;
		}
	}
}
