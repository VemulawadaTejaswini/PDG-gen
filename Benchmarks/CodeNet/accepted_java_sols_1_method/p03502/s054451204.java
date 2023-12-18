import java.util.*;
public class Main {
  public static void main(String[] args){  
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum=0;
    int target = N;
    for (int i=0;i<8;i++){
      sum += target % 10;
      target = target/10;
      
      if (target == 0) break;
    }    
    
    if (N%sum == 0){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}