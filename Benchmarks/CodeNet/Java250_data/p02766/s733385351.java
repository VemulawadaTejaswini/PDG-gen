import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long t = 1L;
        int r = 0;
        while(true){
            if(n < t)break;
            t *= k;
            r++;
        }
        System.out.println(r);
        sc.close();

    }

}
