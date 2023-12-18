import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int lim = sc.nextInt();

            long[] aBooks = new long[n];
            long[] bBooks = new long[m];

            for  (int i = 0; i < n; i++) {
            	aBooks[i] = sc.nextLong();
            }

            for  (int i = 0; i < m; i++) {
            	bBooks[i] = sc.nextLong();
            }

            int a = 0;
            int b = 0;

            long  ans = 0;

            while (lim > 0 || (a < n && b < m)) {

            	long A = 0;
            	long B = 0;

            	if  (a >= n) {

            		A = Integer.MAX_VALUE;
            		B = bBooks[b];

            	} else  if (b >= m) {

            		A = aBooks[a];
            		B = Integer.MAX_VALUE;

            	} else {
            		A = aBooks[a];
                	B = bBooks[b];
            	}


            	if (A <= B) {
            		lim -= A;

            		if (lim < 0) {
            			break;
            		} else {
            			ans ++;
            			a ++;
            		}
            	} else {
            		lim -= B;

            		if (lim < 0) {
            			break;
            		} else {
            			ans ++;
            			b ++;
            		}

            	}
            }
            System.out.println(ans);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
