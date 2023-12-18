import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int i,j,k,l,m,n,x,y,z;
     double s=0,f=0;
     n=sc.nextInt();
     m=sc.nextInt();
     int a[] = new int[n];
     for(i=0;i<n;i++)
     {
         a[i] = sc.nextInt();
         s=s+a[i];
         
     }
     Arrays.sort(a);
     s=(Math.ceil(s/(4*m)));
    
     for(j=n-1;j>=(n-m);j--)
     {
         if(a[j]<(int)s)
         {
             f=1;
             System.out.print("No");
             break;
         }
     }
     if(f!=1)
     {
         System.out.println("Yes");
     }
    }
}