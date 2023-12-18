import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = sc.nextInt();
    int A[] = new int [M];
    int left = 0;
    for(int i=0;i<M;i++){
      if(sc.nextInt()<X){
        left++;
      }
    }
    System.out.println(Math.min(left, M-left));
  }
}
    
    
    