import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int l=sc.nextInt();int r=sc.nextInt();int n=sc.nextInt();
  int count=0;
  for(int i=l;i<=r;i++){
  if(i%n==0)count++;
  }System.out.println(count);
}
}