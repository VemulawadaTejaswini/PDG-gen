import java.util.*;
 
public class Main{
    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long N=0;
        long K=0;
        N=sc.nextLong();
        K=sc.nextLong();
        long m=0;
        m=N/K;
        long min=0;
        min=Math.abs(N-m*K);
        if(min>Math.abs(N-(m-1)*K))
        min=Math.abs(N-(m-1)*K);
        else if(min>Math.abs(N-(m+1)*K))
        min=Math.abs(N-(m+1)*K);
        System.out.println(min);
    }
}