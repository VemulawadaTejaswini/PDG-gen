import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long L [] = new long[n];
        for(int i=0;i<n;i++)L[i] = sc.nextLong();
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int b = sc.nextInt();
            int e = sc.nextInt();
            long k = sc.nextLong();
            int cnt = 0;
            for(int j=b;j<e;j++) if(L[j] == k) cnt++;
            System.out.println(cnt);
        }
    }
}
