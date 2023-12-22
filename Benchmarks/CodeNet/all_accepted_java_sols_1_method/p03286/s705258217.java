
import java.util.*;
class Main{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  long n=sc.nextInt();
  String output="";
  int i=1;
  if(n==0){
      System.out.println(0);
      return;
  }
  while(n!=0){
    if(n%Math.pow(2,i)!=0){
      output="1"+output;
      n-=(long)Math.pow(2,i-1)*(i%2==1?1:-1);
    }else{
      output="0"+output;
    }
    i++;
  }
    System.out.println(output);
  }
}

