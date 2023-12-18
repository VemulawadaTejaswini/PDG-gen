import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int count = n-1;
        boolean b = true;
        for (int i=n-1;i>=0;i--){
            ans+=a[count];
            b=!b;
            if (b)count--;
        }
        System.out.println(ans-1);
    }
}
