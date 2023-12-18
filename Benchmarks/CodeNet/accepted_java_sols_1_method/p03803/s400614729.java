import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    
    for(int i=0; i<13; i++){
      int A=sc.nextInt();     
      int B=sc.nextInt();  
      if(A==1 && B==1 || A==B){
        System.out.println("Draw");
        break;
      }else if(A==1 || B!=1 && A>B){
        System.out.println("Alice");
        break;
      }else if(B==1 || A!=1 && A<B){
        System.out.println("Bob");
        break;
      }
    }
  }
}