import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int H[]=new int[N];
        boolean good[]=new boolean[N];
        int sum=0;
        for(int i=0;i<N;i++){
            H[i]=sc.nextInt();
            good[i]=true;
        }
        for(int i=0;i<M;i++){
            int A=sc.nextInt();
            int B=sc.nextInt();
            if(H[A-1]<H[B-1]){
                good[A-1]=false;
            }else if(H[A-1]>H[B-1]){
                good[B-1]=false;
            }else{
                good[A-1]=false;
                good[B-1]=false;
            }
        }
        for(int i=0;i<N;i++){
            if(good[i]){
                sum++;
            }
        }
        System.out.println(sum);
    }
}