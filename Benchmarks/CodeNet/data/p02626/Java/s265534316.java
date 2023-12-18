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
  long max=Integer.MIN_VALUE;
  long c=a[0]+a[1];
  long f=a[0];
  for(long i=1;i<=100000;i++){
if(i<f&&f-i>max&&((f-i)^(c-f+i))==x){
  as=i;
  max=f-i;
}
  }

  if(as!=0){
  System.out.println(as);
  }else{
System.out.println(-1);
  }
}
}

  