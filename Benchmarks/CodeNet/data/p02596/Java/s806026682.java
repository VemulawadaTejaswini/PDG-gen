import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int K = sc.nextInt();
	if (K%2 == 0) System.out.print(-1);
	else {
	    for (long i=1; i<=K*K*7; i++) {
		String num = Long.toString(K*i);
		boolean isTrue = false;
		for (int j=0; j<num.length(); j++) {
		    if (num.charAt(j) != '7') { break; }
		    if (j == num.length()-1) isTrue = true;
		}
		if (isTrue) { System.out.print(num.length()); break; }
	    }
	}
    }
}
