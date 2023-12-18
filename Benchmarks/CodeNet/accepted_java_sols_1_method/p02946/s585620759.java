import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int K = Integer.parseInt(sc.next());
    int X = Integer.parseInt(sc.next());
    
    int A = X - (K-1);
    int B = X + (K-1);
    for(int i = A; i <= B; i++){
      if(i == B){
        System.out.println(i);
      }else{
        System.out.print(i);
        System.out.print(" ");
      }
    }
  }
}