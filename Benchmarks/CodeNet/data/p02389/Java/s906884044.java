import java.io.*;
import java.util.*;


class Main{
    public static void main(String[] args)throws Exception{
        Scanner cin=new Scanner(System.in);
        int a=cin.nextInt();
        int b=cin.nextInt();
        if(a<b){
           System.out.println("a < b");
        }else{
           if(a==b){
               System.out.println("a == b");
           }else{
               System.out.println("a > b");
           }
        }
    }
}