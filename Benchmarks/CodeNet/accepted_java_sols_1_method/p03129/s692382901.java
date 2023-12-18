import java.util.*;
import java.io.*;
public class Main{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n,k;
n = sc.nextInt();
k = sc.nextInt();
n = n+1;
n=n/2;
if(k>n)
System.out.println("NO");
else
System.out.println("YES");
}
}
