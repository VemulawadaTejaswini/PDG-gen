import java.util.Scanner;
class Main{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
  long a=input.nextInt();
  long b=input.nextInt();
  long c=input.nextInt();
  long d=input.nextInt();
  long t=a*b;
  long y=a*c;
  long j=b*c;
  long k=b*d;
  
  if(t>y&&t>Math.max(j,k)){
  System.out.println(t);
  }else if(y>t&&t>Math.max(j,k)){ 
    System.out.println(y);
  }else if(j>k&&j>Math.max(t,y)){ 
    System.out.println(j);
  }else{
    System.out.println(k);
  }
}
}