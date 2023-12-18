    import java.util.*;
    class Main
    {
      public static void main(String args[])
      {
        Scanner sc=new Scanner (System.in);
        int a,b,c,t;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        t=a;
        a=b;
        b=t;
        t=a;
        a=c;
        c=t;
        System.out.println(a+" "+b+" "+c);
      }
    }
