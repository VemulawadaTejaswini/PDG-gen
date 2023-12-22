import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int Boss[]=new int[N+1];
        int Count[]=new int[N+1];
        int i ;
        for(i=1;i<=(N-1);i++){
            Boss[i]= sc.nextInt();
        }
        for(i=1;i<N;i++){
                Count[Boss[i]]++;
            }
        for(i=1;i<=N;i++)
        System.out.println(Count[i]);
    }
}