
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[5];
        long n = sc.nextLong();
        a[0] = sc.nextLong();
        long min = a[0];
        for(int i=1;i<5;i++){
            a[i] = sc.nextLong();
            if(min>a[i])min=a[i];
        }
        if(min>n){
            System.out.println(5);
            return;
        }
        if(n%min==0){
            System.out.println(n/min + 4);
            return;
        }
        System.out.println(n/min + 5);
    }
}