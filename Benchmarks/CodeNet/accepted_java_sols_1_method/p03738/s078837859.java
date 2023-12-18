import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();
    int dA = A.length();
    int dB = B.length();
    if(dA<dB){
      System.out.println("LESS");
      return;
    }else if(dA>dB){
      System.out.println("GREATER");
      return;
    }else{
    }
    if(A.equals(B)){
      System.out.println("EQUAL");
      return;
    }
    for(int i=0;i<dA;i++){
     if(Integer.parseInt(A.substring(i,i+1))>Integer.parseInt(B.substring(i,i+1))){
       System.out.println("GREATER");
       return;
     }else if(Integer.parseInt(A.substring(i,i+1))<Integer.parseInt(B.substring(i,i+1))){
       System.out.println("LESS");
       return;
     }else{
       continue;
     }
    }
    System.out.println("EQUAL");
  }
  

  
}