import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        int rn = (int) Math.sqrt(n);
        long out = Long.MAX_VALUE;
        for(int i = 1; i <= rn; i++){
            if(n % i == 0){
                out = Math.min(out, i + n / i - 2);
            }
        }
        System.out.println(out);
    }
}