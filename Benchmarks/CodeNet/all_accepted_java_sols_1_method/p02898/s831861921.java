import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();
    
    int sum = 0;
    for(int i = 0; i < n ; i++){
      int height = sc.nextInt();
      if(k <= height){
        sum++;
      }
    }
    System.out.println(sum);
  }
}