import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        long sum = 0;
        for(int i = 1; i<=K; i++){
            for(int j = 1; j<=K; j++){
                for(int k = 1; k<=K; k++){
                    int d = gcd(i,j);
                    d = gcd(k,d);
                    sum+=d;
                }
            }
        }
        System.out.print(sum);
    }

    public static int gcd(int a, int b){
        return (b>0)?gcd(b, a%b):a;
    }

}
