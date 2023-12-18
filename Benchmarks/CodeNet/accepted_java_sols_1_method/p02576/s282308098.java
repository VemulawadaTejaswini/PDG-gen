import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int x=sc.nextInt();
  int t=sc.nextInt();
  int count=n/x;
  if(n%x!=0)count++;
  System.out.println(count*t);
}
}