import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = sc.nextInt();

        long sum = 0;
        for(int i = 1; i < n; i++){
            int b = a;
            a = sc.nextInt();
            if(b - a > 0){
                sum += b - a;
                a += b - a;
            }
        }

        System.out.println(sum);

    }
}
