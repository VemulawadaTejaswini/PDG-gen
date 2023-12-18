import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0,tk=1000;
        int mod=n%1000;
        while(tk<n){
            tk=tk+1000;
        }
        sum=tk-n;
        System.out.println(sum);
    }
}