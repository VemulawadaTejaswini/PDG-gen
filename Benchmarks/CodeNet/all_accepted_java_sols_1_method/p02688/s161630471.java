import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int d[]=new int[K];
        boolean have[]=new boolean[N];
        int sum=0;
        for(int i=0;i<K;i++){
            d[i]=sc.nextInt();
            for(int j=0;j<d[i];j++){
                int temp=sc.nextInt();
                if(have[temp-1] == false){
                    have[temp-1]=true;
                }
            }
        }
        for(int i=0;i<N;i++){
            if(have[i] == false){
                sum++;
            }
        }
        System.out.println(sum);
    }
}