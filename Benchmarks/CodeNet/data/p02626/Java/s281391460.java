import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  long a[]=new long[n];
  for(int i=0;i<n;i++){
a[i]=sc.nextLong();
  }
  long x=0;
  for(int i=2;i<n;i++){
x=x^a[i];
  }
  long as=0;
  long b=0;
  long c=a[0]+a[1];
  
  for(long i=0;i<a[0];i++){
if((i^(c-i))==x){
  as=i;
}
  }
  b=a[0]-as;
  if(as!=0){
  System.out.println(b);
  }else{
System.out.println(-1);
  }
}
}