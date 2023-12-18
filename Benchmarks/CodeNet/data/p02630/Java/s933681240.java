import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] num = new int[10001];
        long sum = 0;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
            num[a[i]]++;
            sum += a[i];
        }
        int q = scan.nextInt();
        int[] b = new int[q];
        int[] c = new int[q];
        for(int i = 0; i < q; i++){
            b[i] = scan.nextInt();
            c[i] = scan.nextInt();
            if(num[b[i]] > 0){
                sum += (c[i] - b[i]) * num[b[i]];
                num[c[i]] += num[b[i]];
                num[b[i]] = 0;
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
