import java.util.*;
public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
Formatter f=new Formatter();
int a=scan.nextInt();
int b=scan.nextInt();
int d=a/b;
int r=a%b;
f.format("%.5f",(double)a/b);
System.out.println(d+" "+r+" "+f);
}}