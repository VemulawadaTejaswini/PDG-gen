import java.util.Scanner;
class Main{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
  int a=input.nextInt();
  int b=input.nextInt();
  int c=input.nextInt();
  int d=input.nextInt();
  int t=a*b;
  int y=a*c;
  int j=b*c;
  int k=b*d;
  
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