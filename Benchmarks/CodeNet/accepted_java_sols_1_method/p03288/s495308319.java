import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int score = sc.nextInt();
    
    if(score<1200){
      System.out.println("ABC");
    }else if(score<2800){
      System.out.println("ARC");
    }else
      System.out.println("AGC");
  }
}