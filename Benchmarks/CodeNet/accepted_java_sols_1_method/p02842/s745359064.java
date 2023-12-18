import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double nonTax = N / 1.08;
        double reCalc = 0;
        while(reCalc < N){
            nonTax -= nonTax % 1;
            reCalc = nonTax * 1.08;
            reCalc -= reCalc % 1;
            nonTax += 1;
            if(reCalc == N) {
                nonTax -= 1;
                System.out.println((int)nonTax);
            }
        }
        if(reCalc >= N+1){
            System.out.println(":(");
        }
    }
}
