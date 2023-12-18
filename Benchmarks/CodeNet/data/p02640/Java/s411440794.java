package June;

import java.util.*; 
public class Crane_and_Turtle{
public static void main(String[] args){
  Scanner input=new Scanner(System.in);
  int a=0,b=0;
  a=input.nextInt()*2;
  b=input.nextInt();
  boolean ans=true;
  while(b>0){
  	if(b>=2){
      b-=2;
      a--;
    }
    if(a>0){
      ans=false;
    }
  }
  System.out.print(ans);
}
}
