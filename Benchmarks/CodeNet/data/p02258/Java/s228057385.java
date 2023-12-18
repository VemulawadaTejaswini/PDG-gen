import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long min = 10000000000;
        long ret = -10000000000;

        for (int i = 0; i<n; i++){
            long r = sc.nextInt();
            if (r - min > ret) ret = r - min;
            if (r < min) min = r;
        }
        System.out.println(ret);
    }
}