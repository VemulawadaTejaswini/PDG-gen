import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        double B = sc.nextDouble();
        long b = (long)((B*100.0)+0.5);
        final long ans = A*b;
        String ansstr = String.valueOf(ans);
        if(ansstr.length() <= 2){
            System.out.println("0");
        }else {
            System.out.println(ansstr.substring(0, ansstr.length() - 2));
        }
    }
}
