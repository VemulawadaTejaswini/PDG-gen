import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long a=sc.nextInt();
        long b=sc.nextInt();
        if(a>b||(n==1&&a!=b)){
            System.out.println(0);
        }else{
            System.out.println((b*(n-1)+a)-(a*(n-1)+b)+1);
        }
    }
}