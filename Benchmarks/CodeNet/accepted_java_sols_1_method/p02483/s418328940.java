import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner input=new Scanner(System.in);
        int a,b,c;
        a=input.nextInt();
        b=input.nextInt();
        if (a>b) {
            c=a;
            a=b;
            b=c;
        }
        c=input.nextInt();
        if (b>c) {
            int t=c;
            c=b;
            b=t;
        }
        System.out.printf("%d %d %d\n",(a>b ? b : a),(a>b ? a : b), c);
    }
}