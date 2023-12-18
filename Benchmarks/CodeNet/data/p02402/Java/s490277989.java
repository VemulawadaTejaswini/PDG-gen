import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int mx=-10000000;
        int mi=10000000;
        long sum=0;
        for(int i=0;i<N;i++){
            int a=sc.nextInt();
            sum+=a;
            if(mx<a){mx=a;}
            if(mi>a){mi=a;}
        }
        System.out.printf("%d %d %d\n",mi,mx,sum);
    }     
}

