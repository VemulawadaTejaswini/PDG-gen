import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(!s.equals("AAA")&&!s.equals("BBB")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}