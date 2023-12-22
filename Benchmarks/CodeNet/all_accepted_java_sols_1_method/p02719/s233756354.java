import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        
        
        long ab = N;
        ab = N % K;
       // System.out.print(ab);
        
        long min = Math.abs(ab - K);
        if(min > ab){
            min = ab;
        }
        
        System.out.print(min);
    }
}