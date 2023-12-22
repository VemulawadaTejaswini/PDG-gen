import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),t=sc.next();
        int a=sc.nextInt(),b=sc.nextInt();
        if(s.equals(sc.next())){
            a--;
        }else{
            b--;
        }
        System.out.println(a +" "+b);
    }
}