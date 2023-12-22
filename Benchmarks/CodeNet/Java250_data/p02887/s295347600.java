import java.util.*;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        //A();
        //B();
        C();
        //D();
    }
    public static void A(){
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println((n-2*m>0)?n-2*m:0);
    }
    public static void B(){
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int sum=0;
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
                sum+=a[i]*a[j];
        System.out.println(sum);
    }
    public static void C(){
        int n=sc.nextInt();
        char []po=sc.next().toCharArray();
        char c=po[0];
        int ans=1;
        for(int i=1;i<n;i++)
            if(c!=(c=po[i]))
                ans++;
        System.out.println(ans);
    }
    public static void D(){
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        long ans=0;
        for(int i=0;i<n-2;i++){
            int kk=i+1;
            for(int j=i+1;j<n-1;j++){
                for(int k=(Math.max(kk,j));k<n;k++)
                    if(!(a[i]+a[j]>a[k]))
                        break;
                    else kk=k;
                ans+=kk-j;
            }
        }
        System.out.println(ans);
    }
}
