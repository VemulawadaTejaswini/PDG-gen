import java.util.*;
public class Main {
static Scanner inp=new Scanner(System.in);
static int a[]=new int [100000];
    public static void sort(int x,int y){
        int l=x;
        int r=y;
        int m=a[(l+r)/2];
        while (l<r){
            while(a[l]<m)l++;
            while(a[r]>m)r--;
            if (l<=r){
                int z=a[l];a[l]=a[r];a[r]=z;
                l++;
                r--;
            }
        }
        if (l<y)sort(l,y);
        if (r>x)sort(x,r);
    }
    public static void main(String args[]) {
        int n=inp.nextInt();
        while (n>0){
            for (int i=1;i<=n;i++)a[i]=inp.nextInt();
            sort(1,n);
            int ans=100000000;
            for (int i=2;i<=n;i++)if (a[i]-a[i-1]<ans)ans=a[i]-a[i-1];
            n=inp.nextInt();
            System.out.println(ans);
        }
    }
 
}