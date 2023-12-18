import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        long minVal= Long.MAX_VALUE;

        long N  =sc.nextLong();

        for (int i = 0; i <5 ; i++) {
            long a  =sc.nextLong();
            if( a < minVal){
                minVal = a;
            }
        }

        ans = 4+ (long)Math.ceil((double)N/minVal);

        System.out.println(ans);
    }

}
