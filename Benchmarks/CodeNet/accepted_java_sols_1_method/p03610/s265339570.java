import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String[] input = sc.nextLine().split("");
    
    for(int i=0; i<input.length; i++){
      if((i+1)%2 !=0){
      System.out.print(input[i]);
      }
    }
  }
}
