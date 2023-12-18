import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int b,c;
        long ans[] = new long[q];
        for(int i=0;i<q;i++){
            b = sc.nextInt();
            c = sc.nextInt();
            ans[i] = change(a,b,c);
        }
        for (long x : ans) {
            System.out.println(x);
        }
    }

    static long change(int[] a,int f,int t){
        long ans = 0;
        for (int i=0;i<a.length;i++){
            if(a[i]==f){
                a[i] = t;
            }
            ans += a[i];
        }
        return ans;
    }
}