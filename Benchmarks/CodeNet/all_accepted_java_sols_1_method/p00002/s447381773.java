import  java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int a,b;
            a = in.nextInt();
            b = in.nextInt();
            System.out.println((int)Math.log10(a+b)+1);
        }
    }
}