import java.util.*;
public class Main{
 
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
    String[] S = scanner.nextLine().split("");
    int mind = 0;
    for(String x : S){
      if(x.equals("+")){
      mind++;
      }else{
      mind--;
      }
    }
    System.out.println(mind);
  }
  
}