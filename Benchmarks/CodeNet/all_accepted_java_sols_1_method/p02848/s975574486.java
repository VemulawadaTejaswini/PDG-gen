import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        sc.close();
        for(int i=0;i<str.length();i++){
            System.out.printf("%c",(str.charAt(i)+n-'A')%26+'A');
        }
        System.out.println();
    }
}