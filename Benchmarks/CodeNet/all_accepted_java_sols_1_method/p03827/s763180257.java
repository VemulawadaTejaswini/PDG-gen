import java.io.*;
import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();int k=0;
String s=sc.next();int d=0;
for(int c=0;c<n;c++){
if(s.charAt(c)=='I')++k;
if(s.charAt(c)=='D')--k;
if(d<=k)d=k;}
System.out.println(d);
}}