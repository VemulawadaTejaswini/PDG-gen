import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int mina=Integer.MAX_VALUE;
        int minb=Integer.MAX_VALUE;
        int[] as=new int[a];
        int[] bs=new int[b];
        for(int i=0;i<a;i++){
            as[i]=sc.nextInt();
            mina=Math.min(mina, as[i]);
        }
        for(int i=0;i<b;i++){
            bs[i]=sc.nextInt();
            minb=Math.min(minb, bs[i]);
        }
        int ans=mina+minb;
        for(int i=0;i<m;i++){
            ans=Math.min(ans, as[sc.nextInt()-1]+bs[sc.nextInt()-1]-sc.nextInt());
        }
        System.out.println(ans);
        
        
 
    }



}
