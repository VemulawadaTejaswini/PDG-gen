import java.util.Scanner;
public class Main {
    static int maxvalue, minweight, n, capacity;
    static int[] treasureV, treasureW;
    public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	int cnt = 1;
	String[] input;
	while (true) {
	    capacity = Integer.parseInt(scan.nextLine());
	    if (capacity == 0) {
		break;
	    }
	    n = Integer.parseInt(scan.nextLine());
	    treasureV = new int[n];
	    treasureW = new int[n];
	    maxvalue = 0;
	    minweight = 0;
	    for (int i = 0; i < n; i++) {
		input = scan.nextLine().split(",");
		treasureV[i] = Integer.parseInt(input[0]);
		treasureW[i] = Integer.parseInt(input[1]);
	    }
	    solve(-1, 0, 0);
	    System.out.println("Case " + cnt++ + ":");
	    System.out.println(maxvalue);
	    System.out.println(minweight);
	}
    }
    
    public static void solve (int i, int nowvalue, int nowweight) {
	if (nowweight > capacity) {
	    return;
	}
	if (nowvalue > maxvalue) {
	    maxvalue = nowvalue;
	    minweight = nowweight;
	} else if (nowvalue == maxvalue && nowweight < minweight) {
	    minweight = nowweight;
	}
	if (i + 1 >= n) {
	    return;
	}
	solve(i+1, nowvalue, nowweight);
	solve(i+1, nowvalue+treasureV[i+1], nowweight+treasureW[i+1]);
    }
}