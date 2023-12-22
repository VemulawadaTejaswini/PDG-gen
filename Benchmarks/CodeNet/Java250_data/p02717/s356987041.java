import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        int a,b,c,d=0,e=0;
        a=tan.nextInt();
        b=tan.nextInt();
        c=tan.nextInt();
        d=a;
        a=b;
        b=d;
        d=a;
        a=c;
        c=d;
        System.out.println(a+" "+b+" "+c);
    }
   
}
