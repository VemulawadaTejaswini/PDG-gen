import java.util.Scanner;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //System.out.println(N);
        double[] x = new double[N];
        String[] u = new String[N];
        for (int i = 0; i < N; i++) {
        	x[i] = sc.nextDouble();
        	u[i] = sc.next();
        }

        double ans = 0;
        for (int i = 0; i < N; i++) {
        	double ans2 = 0;
        	if (u[i].equals("JPY")) {
        		ans2 = x[i];
        	} else if (u[i].equals("BTC")) {
        		ans2 = x[i] * 380000.0;
        	}
        	//System.out.println(ans2);
        	ans += ans2;
        }
        System.out.println(ans);
    }

}