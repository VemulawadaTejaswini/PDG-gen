import java.util.*;
public class pck4 {
    public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	int n;
	int [] k = new int[10000]
	while(true) {
	    n = scan.nextInt();
	    if(n == 0) break;
	    for(int i = 0;i < n;i++) {
		k[i] = scan.nextInt();
		if(n == 1) {
		    if(k[i] > 1) {
			System.out.println(2);
		    }
		} else if(n >= 2) {
		    System.out.println(n + 1);
		}
	    }
	}
    }
}