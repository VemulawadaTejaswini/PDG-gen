import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int M = 0;
        for(int i = 1;i<=N;i++){
            for(int j = 1;j<=N;j++){
                // M = M + gcd(i,j);
                for(int k = 1;k<=N;k++){
                    M = M + gcd(i,gcd(j,k));
                }
            }
        }
        System.out.print(M);
    }

    public static int gcd(int a,int b){
        int c = a;
        a = Math.min(a,b);
        b = Math.max(c,b);

        while(b%a != 0){
            c = a;
            a = b%a;
            b = c;
        }
        return a;
    }
}