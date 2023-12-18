import java.util.*;
 
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
        
    if(A + B + C >= 22){
      //22以上ならbust
      System.out.println("bust");
    }else{
      //それ以外
       System.out.println("win");
    }
  }
 }