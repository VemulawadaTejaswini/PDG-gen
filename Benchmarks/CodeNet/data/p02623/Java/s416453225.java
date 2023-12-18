import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n+1];
        long[] b = new long[m+1];
        a[n]=Long.MAX_VALUE;
        b[m]=Long.MAX_VALUE;
        int count = 0;
        int ca = 0;
        int cb = 0;
        long instance = 0;
        boolean bool = true;
        for (int i=0;i<n;i++)a[i]=sc.nextLong();
        for (int i=0;i<m;i++)b[i]=sc.nextLong();
        while (instance<=k&&bool){
            if (ca<n&&cb<m){
                if (a[ca]<b[cb]){
                    instance+=a[ca];
                    ca++;
                }else if (a[ca]>b[cb]){
                    instance+=b[cb];
                    cb++;
                }else {
                    if (a[ca+1]<=a[ca]){
                        instance+=a[ca];
                        ca++;
                    }else if (b[cb+1]<b[cb]){
                        instance+=b[cb];
                        cb++;
                    }
                }
                count++;
                if (instance>k)count--;
            }else if (ca>=n&&cb<m){
                instance+=b[cb];
                cb++;
                count++;
                if (instance>k)count--;
            }else if (ca<n){
                instance+=a[ca];
                ca++;
                count++;
                if (instance>k)count--;
            }else {
                bool=false;
            }
        }
        System.out.println(count);
    }
}
