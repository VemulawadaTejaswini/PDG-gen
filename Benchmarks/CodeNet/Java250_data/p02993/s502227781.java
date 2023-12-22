import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    boolean good = true;
    
    for (int i=0;i<S.length()-1;i++){
     if (S.charAt(i) == S.charAt(i+1)){
       good = false;
     }
    }
    if (good){
      System.out.println("Good");
    }else{
      System.out.println("Bad");
    }
  }
}