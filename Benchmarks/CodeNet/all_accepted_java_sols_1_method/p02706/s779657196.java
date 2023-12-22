import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += sc.nextInt();
        }

        int res = n - sum;
        if(res < 0) res = -1;

        System.out.println(res);


    }
}