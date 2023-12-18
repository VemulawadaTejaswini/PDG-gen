import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=Integer.parseInt(sc.next());
        int[] t=new int[N+1];
        int[] x=new int[N+1];
        int[] y=new int[N+1];
        boolean flag=true;
        for(int i=1;i<= N;i++){
            t[i]=Integer.parseInt(sc.next());
            x[i]=Integer.parseInt(sc.next());
            y[i]=Integer.parseInt(sc.next());
            int dt=t[i]-t[i-1];
            int dist=Math.abs(x[i]-x[i-1])+Math.abs(y[i]-y[i-1]);
            if (dt<dist || ((dist-dt)%2!=0)){
                flag=false;
                break;
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
}