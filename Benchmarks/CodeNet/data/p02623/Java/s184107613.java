import java.util.*;
public class Main {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
        long[] a = new long[n+1];
        long[] b = new long[m+1];
        a[0] = 0;
        for(int i = 1;i<=n;i++)a[i]=a[i-1]+sc.nextLong();
        b[0] = 0;
        for(int i = 1;i<=m;i++)b[i]=b[i-1]+sc.nextLong();
        int result = 0,maxB = m;
        for(int i = 0;i<=n&&a[i]<=k;i++){
            long k2 = k - a[i];
            for(int j = maxB;j>=0;j--){
                if(b[j]<=k2){
                    if(result< i+j)result = i+j;
                    maxB = j;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
