import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner rv=new Scanner(System.in);
        int n ,m;
        n=rv.nextInt();
        m=rv.nextInt();
        int a[]=new int[m];
        int i;
        long sum=0;
        for(i=0;i<m;i=i+1)
        {
            a[i]=rv.nextInt();
            sum=sum+a[i];
        }
        if(sum<=n)
            System.out.println(n-sum);
        else
            System.out.println("-1");
    }
}
