import java.util.*;
import java.math.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String[] a=new String[n];
for(int i=0;i<n;i++)
a[i]=sc.next();
Set<String> s=new HashSet<>();
for(String x:a)
s.add(x);
System.out.println(s.size());
}}