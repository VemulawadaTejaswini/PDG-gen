import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    
    char[] num = new char[K];
    String[] T = sc.nextLine().split(" ");
    for(int i = 0; i < K; i++){
      num[i] = T[i].charAt(0);
    }
    
    con : for(int i = N; i < 100000; i++){
      String str = i + "";
      for(int j = 0; j < str.length(); j++){
        for(int k = 0; k < K; k++){
          if(str.charAt(j) == num[k]){
            continue con;
          }
        }
      }
      System.out.println(i);
      return;
    }
  }
}