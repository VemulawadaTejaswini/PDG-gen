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

            int a = 0;
            int b = 0;

            int  ans = 0;

            while (lim > 0 || (a < n && b < m)) {

            	int A = 0;
            	int B = 0;;

            	if  (a >= n) {

            		A = Integer.MAX_VALUE;
            		B = aBooks[b];

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
