
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt(), count = 0;
	int[] occ = new int[n];
	boolean flag = true;
	for (int i = 0; i < n; i++) {
	    int x = sc.nextInt();
	    occ[x]++;
	    if ((occ[0] == 1 && (n & 1) == 0) || occ[0] >= 2 || occ[x] > 2)
		flag = false;
	    if ((x + (n - 1)) % 2 != 0)
		flag = false;
	}
	//System.err.println(Arrays.toString(occ));
//	System.err.println(flag);
	if (!flag)
	    System.out.println(0);
	else {
	    for (int i = 0; i < n; i++)
		if (occ[i] == 2)
		    count++;
	    //System.err.println(count);
	    System.out.println(BigInteger.valueOf(2).modPow(BigInteger.valueOf(count), BigInteger.valueOf(MOD)));
	}
    }

}
