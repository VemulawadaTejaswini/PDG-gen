import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        long INF = Long.MAX_VALUE;

        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long d = sc.nextLong();
            if(a==0 && b==0 && d==0) break;

            long minx = INF, miny = INF;
            for(long x=0; x<=10000000; x++){
                long num = d - a * x;
                if(num<0) num = -num;
                if(num%b==0){
                    long y = num/b;
                    if(minx==INF || x+y<minx+miny){
                        minx = x;
                        miny = y;
                    }else if(x+y==minx+miny){
                        if(a*x+b*y<a*minx+b*miny){
                            minx = x;
                            miny = y;
                        }
                    }
                }
            }

            System.out.println(minx+" "+miny);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}