import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong(),a=sc.nextLong(),b=sc.nextLong();
        long ans=n/(a+b)*a;
        long r=n%(a+b);
        if(r>a)r=a;
        System.out.println((ans+r));
    }
}