import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        long d=0,e=0;
        d=a%(b+c);
        e=a/(b+c);
        if(d>=b)
        System.out.println(e*b+b);
        else
        System.out.println(e*b+d);
    }
}