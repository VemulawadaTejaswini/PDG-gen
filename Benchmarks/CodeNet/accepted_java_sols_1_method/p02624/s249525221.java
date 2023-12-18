import java.util.*;

public class Main {
    static List<Integer> sosu;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long sum = 0;
        for(long i=1;i<=T;i++){
            final long bai = (long)(T/i);
            final long cap = bai * i;
            sum += (cap+i) * (cap/i) / 2;
        }
        System.out.println(sum);
    }

}
