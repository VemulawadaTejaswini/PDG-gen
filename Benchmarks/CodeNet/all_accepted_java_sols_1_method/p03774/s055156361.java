import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] a=new int[N];
        int[] b=new int[N];
        int[] c=new int[M];
        int[] d=new int[M];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        for(int i=0;i<M;i++){
            c[i]=sc.nextInt();
            d[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            int minDis=1000000000;
            int minPoint=0;
            for(int j=0;j<M;j++){
                int mdis=Math.abs(a[i]-c[j])+Math.abs(b[i]-d[j]);
                if(mdis<minDis){
                    minPoint=j;
                    minDis=mdis;
                }
            }
            System.out.println(minPoint+1);
        }
        return;
    }
}