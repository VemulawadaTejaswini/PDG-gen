import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[]=new long[100001];
        long sum = 0;

        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            arr[a] += 1;
            sum += a;
        }

        int q = sc.nextInt();

        int[] bArr = new int[q];
        int[] cArr = new int[q];
        for(int i=0; i<q; i++) {
            bArr[i] = sc.nextInt();
            cArr[i] = sc.nextInt();
        }

        for(int i=0; i<q; i++) {
            int b = bArr[i];
            int c = cArr[i];
            long count = arr[b];
            arr[b]=0;
            arr[c]+=count;
            sum += (c-b)*count;
            System.out.print(sum);
            System.out.print("\n");
        }
    }
}