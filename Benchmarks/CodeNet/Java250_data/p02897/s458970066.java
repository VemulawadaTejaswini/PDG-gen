import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n%2==0)
System.out.print("0.5000000000");
else
{
int a=n/2+1;
double d=(double)a/n;
System.out.format("%.10f",d);

}
}
}