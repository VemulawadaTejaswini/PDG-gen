import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        long sum = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        int q = sc.nextInt();
        int b,c;
        long ans[] = new long[q];
        for(int i=0;i<q;i++){
            b = sc.nextInt();
            c = sc.nextInt();
            ans[i] = sum + (long)(change(a,b,c)*(c-b));
            sum = ans[i];
        }
        for (long x : ans) {
            System.out.println(x);
        }
    }

    static int change(int[] a,int f,int t){
        int count = 0;
        for (int i=0;i<a.length;i++){
            if(a[i]==f){
                a[i] = t;
                count++;
            }
        }
        return count;
    }
}