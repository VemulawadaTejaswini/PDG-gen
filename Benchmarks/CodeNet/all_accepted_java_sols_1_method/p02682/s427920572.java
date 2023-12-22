import java.util.Scanner;

public class Main {
    public static void main(final String args[]) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int K = scan.nextInt();
        int sum = 0;
        if(A >= K){
            sum = K;
        }else if(A < K){
            sum = A;
            K = K - A;
            if(B >= K){
                
            }else if(B < K){
                //sum = sum + B;
                K = K - B;
                if(C >= K){
                    sum = sum - K;
                }else{
                    sum = sum - C;
                }
            }
        }
        System.out.println(sum);
    }
}