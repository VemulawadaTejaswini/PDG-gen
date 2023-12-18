import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
1<=a<=1000 && 1<=b<=1000 && 1<=c<=1000;
for(int x=a;x<=b;x++){System.out.println(x%c==0);}
}}