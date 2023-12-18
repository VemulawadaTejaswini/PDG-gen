import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N,T,sum=0;
        N=sc.nextInt();
        T=sc.nextInt();
        int [] list = new int[N];
        for(int a=0;a<N;a++){
            list[a] = sc.nextInt();
            }
            for(int a=1;a<N;a++){
            if(list[a]-list[a-1]<=T)sum+=list[a]-list[a-1];
            else sum+=T;
            }
    sum+=T;
        System.out.println(sum);
         }
}