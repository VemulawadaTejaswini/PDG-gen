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
            for(long i=-100000; i<=100000; i++){
                long num = d - a * i;
                num = Math.max(num, -num);
                if(num%b==0){
                    long x = Math.max(i, -i);
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