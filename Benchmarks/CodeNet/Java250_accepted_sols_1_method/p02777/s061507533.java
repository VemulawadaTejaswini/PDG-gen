import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String s,t;
        int a,b;
        String u;
        s = scan.next();
        t = scan.next();
        a = scan.nextInt();
        b = scan.nextInt();
        u = scan.next();
        if(u.equals(s)) a-=1;
        else b-=1;
        System.out.printf(a+" "+b);
    }
}