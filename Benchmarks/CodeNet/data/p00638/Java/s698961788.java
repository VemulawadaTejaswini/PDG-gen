import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
    class P implements Comparable<P>{
        int fr,sc;
        public P(int fr,int sc){
            super();
            this.fr = fr;
            this.sc = sc;
        }
        public int compareTo(P p){
            return sc - p.sc;
        }
    }
    void run(){
        Scanner scan = new Scanner(System.in);
        int n;
        while((n = scan.nextInt()) != 0){
            P p[] = new P[n];
            for(int i=0;i<n;i++){
                int a = scan.nextInt();
                int b = scan.nextInt();
                p[i] = new P(a,b);
            }
            Arrays.sort(p);
            boolean ok = true;
            for(int i=0,sum=0;i<n;i++){
                sum += p[i].fr;
                if(p[i].sc < sum) ok = false;
            }
            out.println( ( ok ? "Yes" : "No" ) );
        }
    }
    public static void main(String args[]){
        new Main().run();
    }
}