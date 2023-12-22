import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();int m=sc.nextInt();
  n=Integer.parseInt(n+""+m);
  int i=0;
  for(i=0;i*i<n;i++){}
  System.out.println((i*i==n)?"Yes":"No");
}
}
