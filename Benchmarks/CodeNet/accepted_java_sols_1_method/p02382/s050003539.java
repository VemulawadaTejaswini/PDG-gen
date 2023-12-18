import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        for(int i = 0 ; i < n ; i++)
            x[i] = sc.nextInt();
        for(int i = 0 ; i < n ; i++)
            y[i] = sc.nextInt();
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double maxp = 0;
        for(int i = 0 ; i < n ; i++)
        {
            double d = Math.abs(x[i] - y[i]);
            p1 += d;
            p2 += Math.pow(d,2);
            p3 += Math.pow(d,3);
            if(d > maxp)
                maxp = d;
        }
        System.out.println(p1);
        System.out.println(Math.sqrt(p2));
        System.out.println(Math.cbrt(p3));
        System.out.println(maxp);
    }
}
