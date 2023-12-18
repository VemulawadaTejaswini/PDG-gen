import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt(),K=sc.nextInt(),x=0,res=0;
        for(int i=0;i<N;i++){
            x=sc.nextInt();
            res+=(Math.min(x,K-x))*2;
        }
        System.out.println(res);
    }
}