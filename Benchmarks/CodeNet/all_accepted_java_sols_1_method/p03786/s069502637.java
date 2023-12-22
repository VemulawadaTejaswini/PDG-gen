import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        long[]a=new long[n];
        for(int i=0;i<n;++i)a[i]=-Integer.parseInt(scan.next());
        Arrays.sort(a);
        long[]b=new long[n];
        b[n-1]=-a[n-1];
        for(int i=n-2;i>=0;--i)b[i]=b[i+1]-a[i];
        int p;
        for(p=1;p<n;++p)
            if(-a[p-1]>2*b[p])break;
        System.out.println(p);
    }
}
