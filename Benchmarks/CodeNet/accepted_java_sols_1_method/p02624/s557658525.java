import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long res = 0;
        for(int i=1; i<=n; i++) {
            long m = n/i;
            res += i * m * (m+1) / 2;
        }

        System.out.println(res);

    }




}