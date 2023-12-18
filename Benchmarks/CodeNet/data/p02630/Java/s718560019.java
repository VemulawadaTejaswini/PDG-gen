import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100001];
        int instance=0;
        for (int i=0;i<n;i++){
            int b = sc.nextInt();
            instance+=b;
            a[b]++;
        }
        int q = sc.nextInt();
        int[] ans = new int[q];
        for (int i=0;i<q;i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            instance+=(c-b)*a[b];
            a[c]+=a[b];
            a[b]=0;
            ans[i]=instance;
        }
        for (int i=0;i<q;i++)System.out.println(ans[i]);
    }
}
