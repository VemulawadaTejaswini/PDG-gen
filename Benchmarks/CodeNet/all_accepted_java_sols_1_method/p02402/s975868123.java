import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min =  1000000;
        int max = -1000000;
        long sum =  0;
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            if(min > a) min = a;
            if(max < a) max = a;
            sum += a;
        }
        
        System.out.printf("%d %d %d\n", min, max, sum);
    }
}

