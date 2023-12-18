import java.util.Scanner;
   
class Main{
 public static void main(String[] arge){
     
 Scanner sc=new Scanner(System.in);
   
 int x=sc.nextInt();
 int y=sc.nextInt();
 
 int a=x/y;
 int b=x%y;
 

System.out.println(a+" "+b+" "+String.format("%.8f", (double)x/(double)y));
}}

