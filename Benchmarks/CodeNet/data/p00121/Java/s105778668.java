import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;


public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
       int[][] a = new int[2][4];
       int i,j,m;
       long k=1,n=0;
       while(s.hasNext()){
       for(i=0;i<2;i++){
           for(j=0;j<4;j++){
        m=s.nextInt();
        n+=k*(long)m;
        k*=10;
       }
    }


           
        m = solve(n);
        System.out.println(m);
        n=0;
        k=1;
}
    }
    public static int solve(long n){
        Queue<Long> qu=new LinkedList<Long>();
        int[] x = {1,-1,0,0},y= {0,0,1,-1};
        int[] za = new int[100000];
        int[] zb = new int[100000];
        long[] zc =new long[10000000];
        int[][] arr = new int[2][4];
        int i,j,zh=-5,zw=-5,e,ppp=0,col=0,kri=0;
        long k=n,temp,no;
        boolean ch=false,chk=false;
        qu.add(n);
        while(true){
        k = qu.remove();
        if(k%100000000==76543210)return (int)k/100000000+kri;
        for(i=0;i<2;i++){
            for(j=0;j<4;j++){
                arr[i][j]=(int)k%10;
                k/=10;
                if(arr[i][j]==0){
                    zh=i;
                    zw=j;
                }
            }
        }
   //     System.out.println(k+" " +col);
        if(k==19){
            kri=20;
            k=0;
        }
        else k++;

        k*=100000000;
        no = k;
        for(e=0;e<4;e++){
            if(zh+x[e]>=0&&zh+x[e]<2&&zw+y[e]>=0&&zw+y[e]<4){
            arr[zh][zw] = arr[zh+x[e]][zw+y[e]];
            arr[zh+x[e]][zw+y[e]]=0;
        temp =1;
        for(i=0;i<2;i++){
            for(j=0;j<4;j++){
                k+=temp*(long)arr[i][j];
                temp*=10;
            }
        }
        for(ppp=0;ppp<col;ppp++)if(zc[ppp]==k%100000000)ch=true;
        if(ch==false){
            zc[col]=k%100000000;
            qu.add(k);
            col++;
        }
        else ch = false;
        k = no;
        arr[zh+x[e]][zw+y[e]] = arr[zh][zw];
        arr[zh][zw]=0;
    }
}
    }
}

    }

