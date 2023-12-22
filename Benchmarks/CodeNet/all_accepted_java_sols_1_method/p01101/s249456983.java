import java.util.*;
class Main {
    public static void main(String[] r) {
        Scanner s=new Scanner(System.in);
        while(true){
            int n=s.nextInt(),m=s.nextInt();
            if(n<1)break;
            int i,j;
            int[] a=new int[n];
            for(i=0;i<n;i++)a[i]=s.nextInt();
            int M=0;
            for(i=0;i<n;i++)for(j=i+1;j<n;j++)M=Math.max(M,(a[i]+a[j]<=m)?a[i]+a[j]:0);
            System.out.println((M<1)?"NONE":M);
        }
    }
}
