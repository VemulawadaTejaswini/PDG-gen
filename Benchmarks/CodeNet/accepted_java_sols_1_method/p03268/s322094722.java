import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        if(k == 1){
            System.out.println((long)n*(long)n*(long)n);
        }else if(k % 2 == 0){
            long tmp1 = n/k;
            long tmp2 = n/k;
            if(n % k >= k/2) tmp2++;
            System.out.println(tmp1*tmp1*tmp1 + tmp2*tmp2*tmp2);
        }else{
            long tmp = n/k;
            System.out.println(tmp*tmp*tmp);
        }
    }
}