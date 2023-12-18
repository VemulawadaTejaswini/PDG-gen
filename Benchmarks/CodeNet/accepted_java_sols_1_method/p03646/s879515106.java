import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long k=sc.nextLong();
        sc.close();
        long q=k/50;
        long r=k%50;
        System.out.println(50);
        for(int i=0;i<50;i++){
            System.out.print((q+(i<50-r?49-r:100-r))+" ");
        }
    }
}