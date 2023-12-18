import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    static StringBuffer sb = new StringBuffer();
    public static void main(String args[]){
        int N=sc.nextInt(),K=sc.nextInt();
        long res=K;
        for(int i=0;i<N-1;i++){
            res*=(K-1);
        }
        System.out.println(res);
    }
}