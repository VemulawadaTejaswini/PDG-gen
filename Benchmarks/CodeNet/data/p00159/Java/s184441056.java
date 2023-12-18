import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt();
            if(n==0)break;
            double u=2000001;
            int p=0;
            for(int i=0;i<n;i++) {
                int a=sc.nextInt(),b=sc.nextInt();
                double t=Math.abs(22-(double)sc.nextInt()*10000/b/b);
                if(u>t) {
                    u=t;
                    p=a;
                }
            }
            System.out.println(p);
        }
    }
}
