import java.util.Scanner;
class Main
{
public static void main(String args[])
{

  Scanner sc = new Scanner(System.in);

    short a = sc.nextShort();
    short b = sc.nextShort();
    short c = sc.nextShort();
    sc.close();
    short d = 0;


    if (a>b)
    { d=a;
      a=b;
      b=d;  }

    if (b>c)
    {  d=b;
       b=c;
       c=d;  }

    if (b<a)
    { d=b ; b=a; a=d;}
    System.out.println(a + " " + b + " " + c);
}
}

