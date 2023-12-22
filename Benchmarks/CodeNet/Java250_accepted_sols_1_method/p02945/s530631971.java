import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int s=a+b;int m=a*b;int d=a-b;
if(s>m && s>d)
System.out.println(s);
else if(m>s && m>d)
System.out.println(m);
else
System.out.println(d);
}

}