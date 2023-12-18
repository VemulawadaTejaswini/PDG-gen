import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int D = Integer.parseInt(S[1]);
    int[][] num = new int[N][D];
    for(int i = 0; i < N; i++){
      String[] T = sc.nextLine().split(" ");
      for(int j = 0; j < D; j++){
        num[i][j] = Integer.parseInt(T[j]);
      }
    }
    
    int count = 0;
    for(int i = 0; i < N; i++){
      for(int j = i; j < N; j++){
        if(i != j){
          int b = 0;
          for(int k = 0; k < D; k++){
            b += (num[i][k] - num[j][k])*(num[i][k] - num[j][k]);
          }
          int a = (int)Math.sqrt(b);
          if((a*a) == b){
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
}