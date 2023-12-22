import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int lMax = 1;
        int rMin = n;
        for (int i = 0; i < m; i++) {
            int l = s.nextInt();
            int r = s.nextInt();
            lMax = (lMax < l ? l : lMax);
            rMin = (rMin > r ? r : rMin);
        }
        int res = rMin - lMax + 1;
        System.out.println((res < 0)? 0 : res);
	}
}