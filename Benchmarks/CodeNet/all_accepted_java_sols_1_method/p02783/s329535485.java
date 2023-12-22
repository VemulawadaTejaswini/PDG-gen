import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        int h,a,k;
        k=0;
        Scanner sc=new Scanner(System.in);
        h=sc.nextInt();
        a=sc.nextInt();
        for(int i=1;h>0;i++){
            h=h-a;
            k=i;
        }
        System.out.println(k);
    }
}