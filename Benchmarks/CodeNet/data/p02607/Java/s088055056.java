import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int cnt = 0;

    for(int i = 1; i <= n; i++){
      int num = sc.nextInt();
      
      if(i % 2 == 1 && num % 2 == 1){cnt++;}
    }
    
    System.out.println(cnt);
  }
}