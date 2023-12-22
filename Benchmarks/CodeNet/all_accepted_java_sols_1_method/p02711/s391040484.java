import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    for(int i = 0; i < 3; i++){
      if(N%10 == 7){
        System.out.println("Yes");
        return;
      }
      N /= 10;
    }
    System.out.println("No");
    return;
  }
}