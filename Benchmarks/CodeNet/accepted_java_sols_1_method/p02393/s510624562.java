import java.util.Scanner;

public class Main{
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&b>c)
            System.out.println(c+" "+b+" "+a);
        if(a<b&&b<c||a==b&&a<c||a<b&&b==c)
            System.out.println(a+" "+b+" "+c);
        if(c>a&&a>b||a>b&&a==c)
            System.out.println(b+" "+a+" "+c);
        if(b>a&&a>c||a==b&&a>c)
            System.out.println(c+" "+a+" "+b);
        if(b>c&&c>a||a<b&&a==c)
            System.out.println(a+" "+c+" "+b);
        if(a>c&&c>b||a>b&&b==c)
            System.out.println(b+" "+c+" "+a);
        if(a==b&&b==c)
            System.out.println(a+" "+b+" "+c);
    }
}
