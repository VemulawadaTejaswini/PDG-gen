import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
        long k=in.nextLong();
        if(k%2==0){
            System.out.println(a-b);
        }else{
            System.out.println(b-a);
        }
    }
}