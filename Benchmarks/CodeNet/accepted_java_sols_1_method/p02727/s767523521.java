import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{


        // Mapの宣言
        Map<Integer, String> mMap = new HashMap<Integer, String>();

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int na = sc.nextInt();
		int nb = sc.nextInt();
		int nc = sc.nextInt();

		Integer[] a = new Integer[na];
		Integer[] b = new Integer[nb];
		Integer[] c = new Integer[nc+x+y];

		for (int i=0; i<na; i++) {
			a[i]=new Integer(sc.nextInt());
		}
		for (int i=0; i<nb; i++) {
			b[i]=new Integer(sc.nextInt());
		}
		for (int i=0; i<nc; i++) {
			c[i]=new Integer(sc.nextInt());
		}
		sc.close();

		Arrays.sort(a, Collections.reverseOrder());
		Arrays.sort(b, Collections.reverseOrder());

		for (int i=0; i<x; i++) {
			c[i+nc]=a[i];
		}

		for (int i=0; i<y; i++) {
			c[i+nc+x]=b[i];
		}

		Arrays.sort(c, Collections.reverseOrder());

        BigInteger ans = BigInteger.ZERO;
        for (int i = 0; i<x+y; i++) {
        	ans = ans.add(BigInteger.valueOf((Integer)c[i]));
       	}
		System.out.println(ans.toString());
	}
}
