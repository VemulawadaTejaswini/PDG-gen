import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long L =M/N;
        long ans=1;
         for(long i=1;i<=Math.sqrt(M);i++){
             if(M%i==0){
                 if(i<=L){
                     ans =Math.max(i,ans);
                 }
                 if(M/i<=L){
                     ans =Math.max(M/i,ans);
                 }
             }
         }
        System.out.println(ans);
    }
}