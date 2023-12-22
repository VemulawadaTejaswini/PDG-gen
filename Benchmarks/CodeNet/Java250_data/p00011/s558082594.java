import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] am = new int[32];
        int n,i,w,a,b,t;
        String st;
        String[] x;
        w = s.nextInt();
        n = s.nextInt();
        for(i=1;i<=w;i++)am[i]=i;
        for(i=1;i<=n;i++){
            st = s.next();
            x = st.split(",");
            a = Integer.parseInt(x[0]);
            b = Integer.parseInt(x[1]);
            t = am[a];
            am[a] = am[b];
            am[b] = t;
        }
        for(i=1;i<=w;i++)System.out.println(am[i]);
    }
}
