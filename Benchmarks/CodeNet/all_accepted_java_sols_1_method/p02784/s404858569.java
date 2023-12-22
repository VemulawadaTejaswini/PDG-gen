import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int N = sc.nextInt();
    
    int damage = 0;
    for(int i=0; i<N; i++){
      damage += sc.nextInt();
    }
    
    if(damage >= H){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
    
  }
}