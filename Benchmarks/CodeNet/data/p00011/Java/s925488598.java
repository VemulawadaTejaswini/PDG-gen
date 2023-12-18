import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] am = new int[32];
        int n,i,w,a,b,t;
        String st;
        n = s.nextInt();
        w = s.nextInt();
        for(i=1;i<=n;i++)am[i]=i;
        for(i=1;i<=w;i++){
            st = s.next();
            t = am[st.charAt(0)-'0'];
            am[st.charAt(0)-'0'] = am[st.charAt(2)-'0'];
            am[st.charAt(2)-'0'] = t;
        }
        for(i=1;i<=n;i++)System.out.println(am[i]);
    }
}
