import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int d,r;
        double f;
        d=a/b;
        String str1 = String.format("%d",d);
        System.out.print(str1+" ");
        r=a%b;
        String str2 = String.format("%d",r);
        System.out.print(str2+" ");
        f=(double)a/b;
        String str3 = String.format("%f",f);
        System.out.print(str3+" ");
    }
}

