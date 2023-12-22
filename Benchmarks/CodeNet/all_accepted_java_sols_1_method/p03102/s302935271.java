import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] s = sc.nextLine().split(" ");
    int N = Integer.parseInt(s[0]);
    int M = Integer.parseInt(s[1]);
    int C = Integer.parseInt(s[2]);
    
    String[] t = sc.nextLine().split(" ");
    int[] B = new int[M];
    for(int i = 0; i < M; i++){
      B[i] = Integer.parseInt(t[i]);
    }
    
    int count = 0;
    for(int i = 0; i < N; i++){
      String[] u = sc.nextLine().split(" ");
      int sum = 0;
      for(int j = 0; j < M; j++){
        sum += Integer.parseInt(u[j]) * B[j];
      }
      
      if(sum + C > 0){
        count++;
      }
    }
    System.out.println(count);
  }
}