import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        long ans=x/500*1000+(x%500)/5*5;
        System.out.println(ans);
    }
}