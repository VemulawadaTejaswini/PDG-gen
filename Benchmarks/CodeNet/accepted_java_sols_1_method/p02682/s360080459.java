
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        sc.close();
        int sum = 0;
        sum+=Math.min(k,a);
        k-=a;
        if(k>0){
            k-=b;
        }
        if(k>0){
            sum-=k;
        }
        System.out.println(sum);
    }
}