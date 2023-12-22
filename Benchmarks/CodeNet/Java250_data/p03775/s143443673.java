import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long N;
        N = scanner.nextLong();
        long ans =0;
        for(long i=1;i*i<=N;i++){
            if(N%i==0){
                ans =Math.max(ans,i);
            }
        }
        long digit = String.valueOf(N/ans).length();
        System.out.println(digit);
    }
}