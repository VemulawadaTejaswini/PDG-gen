import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();

        long ans = 0;

        while (true){
            int cnt = 0;
            for (int i=0; i<n; i++){
                if (a[i]%2==0){
                    a[i] /= 2;
                    cnt++;
                }else {
                    continue;
                }
            }
            if (cnt!=n) break;
            ans++;
        }
        System.out.println(ans);
    }
}