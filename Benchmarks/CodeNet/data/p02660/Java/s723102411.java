import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count = 2;
        double lim = Math.sqrt(n);
        long ins = 0;
        int ans = 0;
        boolean b = true;
        while (n!=1&&count<=lim){
            if (n%count==0){
                n/=count;
                ins++;
                b = false;
            } else {
                int c = 0;
                int i = 1;
                while (c+i<=ins){
                    c+=i;
                    i++;
                }
                ans+=i-1;
                ins=0;
                count++;
            }
        }
        if (ins!=0){
            int c = 0;
            int i = 1;
            while (c+i<=ins){
                c+=i;
                i++;
            }
            ans+=i-1;
        }
        if (b)ans++;
        System.out.println(ans);
    }
}
