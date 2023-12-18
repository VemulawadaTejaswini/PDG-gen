import java.util.*;
public class Main{
    public static void main(String[] args){
 
    int N,K,x,flg;
    int t[] = new int[100];
    Scanner scan = new Scanner(System.in);
    while(true){
        N=scan.nextInt();
        K=scan.nextInt();
        if(N==0&&K==0)break;
        flg=1;
        for(int i=0;i<K;i++)t[i]=scan.nextInt();
        for(int i=0;i<N;i++){
        for(int j=0;j<K;j++){
            x=scan.nextInt();
            t[j]-=x;
            if(t[j]<0)flg=0;
        }
        }
        if(flg==1){
        System.out.println("Yes");
        }else{
        System.out.println("No");
        }
    }
    }
}