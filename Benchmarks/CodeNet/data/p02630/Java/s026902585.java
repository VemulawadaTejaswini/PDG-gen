import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[100001];
        long sum = 0;
        for(int i=0;i<n;i++){
            a[sc.nextInt()]++;

        }
        int q = sc.nextInt();
        int b,c;
        long ans[] = new long[q];
        for(int i=0;i<q;i++){
            b = sc.nextInt();
            c = sc.nextInt();
            a[c] += a[b];
            a[b]=0;
            ans[i] = sum(a);
        }
        for (long x : ans) {
            System.out.println(x);
        }
    }

    static long sum(int[] a){
        long sum = 0;
        for (int i=0;i<a.length;i++){
            if(a[i]!=0){
                sum += a[i]*(i);
            }
        }
        return sum;
    }
}