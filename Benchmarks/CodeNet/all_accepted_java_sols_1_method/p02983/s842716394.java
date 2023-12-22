import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        long L =scn.nextLong();
        long R =scn.nextLong(); 
        R=Math.min(R,L+4038);
        long answer = 2018;
        for(long i=L;i<=R;i++){
            for(long j=i+1;j<=R;j++){
                long x = i*j%2019;
                answer=Math.min(answer,x);
            }
        }
        System.out.println(answer);
    }
}