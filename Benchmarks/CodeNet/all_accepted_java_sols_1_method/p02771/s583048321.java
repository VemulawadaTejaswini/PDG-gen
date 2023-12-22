import java.util.Scanner;

class Main{
  public static void main(String[]args){
    
  Scanner sc=new Scanner(System.in);
  int A=sc.nextInt();
  int B=sc.nextInt();
  int C=sc.nextInt();
    
  if(A==B){
      int X=A;
      if(X==C){
        System.out.println("No");//AとB，C同じ
      }else{
        System.out.println("Yes");//AとBが同じでCが違う
      }
   }else if(A==C){
      System.out.println("Yes");//AとCが同じでBが違う
   }else if(B==C){
      System.out.println("Yes");//BとC同じでAが違う
   }else{
      System.out.println("No");
   }
  }
 }
        
  