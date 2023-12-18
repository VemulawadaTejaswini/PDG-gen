import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int lim = sc.nextInt();

            int[] aBooks = new int[n];
            int[] bBooks = new int[m];

            for  (int i = 0; i < n; i++) {
            	aBooks[i] = sc.nextInt();
            }

            for  (int i = 0; i < m; i++) {
            	bBooks[i] = sc.nextInt();
            }

            int ai = 0;
            int bi = 0;

            int  ans = 0;

            while (lim > 0 || (ai < n && bi < m)) {

            	int A = 0;
            	int B = 0;;

            	if  (ai >= n) {

            		A = Integer.MAX_VALUE;
            		B = bBooks[bi];

            	} else  if (bi >= m) {

            		A = aBooks[ai];
            		B = Integer.MAX_VALUE;
            	} else {
            		A = aBooks[ai];
                	B = bBooks[bi];
            	}
            	if (A <= B) {
            		lim -= A;

            		if (lim < 0) {
            			break;
            		} else {
            			ans ++;
            			ai ++;
            		}
            	} else {
            		lim -= B;

            		if (lim < 0) {
            			break;
            		} else {
            			ans ++;
            			bi ++;
            		}

            	}
            }
            System.out.println(ans);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}