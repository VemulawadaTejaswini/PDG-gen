import java.util.Scanner;


import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            double s[] = new double[n];
            double m=0,a=0;
            for(int i=0;i<n;i++){
                s[i] = sc.nextDouble();
                m+=s[i];
            }
            m/=n;
            for(int i=0;i<n;i++){
                a+=(s[i]-m)*(s[i]-m);
            }
            a/=n;
            System.out.printf("%.8f%n",Math.sqrt(a));
        }
        sc.close();
    }
}

