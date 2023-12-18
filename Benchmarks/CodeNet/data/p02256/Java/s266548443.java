import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();b=sc.nextInt();
        while(b!=0){
            int c=a%b;
            a=b;
            b=c;
        }
        System.out.println(a);
}
}
