import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        long total=0;

        for(int i=1; i<=K; i++){
            for(int j = 1; j<=K; j++){
                for(int l=1; l<=K; l++){
                    total += gcd(gcd(i, j),l);
                    // System.out.println(gcd(gcd(i, j),l));
                }
            }
        }
        System.out.println(total);
    }

    public static int gcd(int a, int b) {
        int r = a % b;
        if(r==0){
            return b;
        }else{
            return gcd(b,r);
        }
    }
}