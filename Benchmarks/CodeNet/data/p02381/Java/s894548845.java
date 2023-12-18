import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0)
                break;

            int[] s = new int[1000];
            for(int i=0;i<n;i++){
                s[i] = sc.nextInt();
            }

            int sum = 0;
            double m;
            for(int i=0;i<n;i++){
                sum += s[i];
            }
            m = (double)sum/n;

            double a = 0;
            for(int i=0;i<n;i++){
                a += (s[i]-m)*(s[i]-m);
            }
            a/=n;

            System.out.printf("%.8f\n", Math.sqrt(a));
        }
    }
}

