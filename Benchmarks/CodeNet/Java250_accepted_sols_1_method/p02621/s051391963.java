import java.util.*; 
import java.lang.*;
public class Main{
 public static void main(String[] args) { 
Scanner sc=new Scanner(System.in); 
int x=sc.nextInt();
 int sum=0; 
for(int i=1;i<=3;i++) 
{ 
int b=(int)Math.pow(x,i);
sum=sum+b;

} 
System.out.println(sum);
 }
 }
