import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long total=0;
        for(long i=1;i<=n;i++){
            if(i%3!=0 && i%5!=0){
                total+=i;
            }
        }
        System.out.println(total);
    }
}