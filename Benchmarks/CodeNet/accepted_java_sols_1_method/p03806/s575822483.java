import java.util.*;

class Main {
    static final int I=1000000000;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int ma=scan.nextInt();
        int mb=scan.nextInt();
        int[]d=new int[n],c=new int[n];
        for(int i=0;i<n;++i){
            int a=scan.nextInt();
            int b=scan.nextInt();
            c[i]=scan.nextInt();
            d[i]=mb*a-ma*b;
        }
        int p=n/2;
        int[]f=new int[1<<p];
        int[]fc=new int[1<<p];
        int[]s=new int[1<<(n-p)];
        int[]sc=new int[1<<(n-p)];
        for(int i=0;i<1<<p;++i)
            for(int j=0;j<p;++j)
                if((i&1<<j)!=0){f[i]+=d[j];fc[i]+=c[j];}
        for(int i=1;i<1<<(n-p);++i)
            for(int j=0;j<n-p;++j)
                if((i&1<<j)!=0){s[i]+=d[p+j];sc[i]+=c[p+j];}
        Map<Integer,Integer>hm=new HashMap<Integer,Integer>();
        for(int i=1;i<1<<(n-p);++i){
            if(hm.containsKey(-s[i]))
                hm.put(-s[i],Math.min(hm.get(-s[i]),sc[i]));
            else
                hm.put(-s[i],sc[i]);
        }
        int m=I;
        for(int i=1;i<1<<(n-p);++i)
            if(s[i]==0)m=Math.min(m,sc[i]);
        for(int i=1;i<1<<p;++i){
            if(f[i]==0)m=Math.min(m,fc[i]);
            if(hm.containsKey(f[i]))
                m=Math.min(m,fc[i]+hm.get(f[i]));
        }
        System.out.println(m==I?-1:m);
    }
}
