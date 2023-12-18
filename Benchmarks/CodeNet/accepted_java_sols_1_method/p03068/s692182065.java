import java.util.*;

public class Main{
  static int[] ans;
  static Map<Integer, Integer> map;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String S = sc.nextLine();
    int K = Integer.parseInt(sc.nextLine())-1;
    
    char c = S.charAt(K);
    char[] C = new char[N];
    for(int i = 0; i < N; i++){
      if(S.charAt(i) == c){
        C[i] = c;
      }else{
        C[i] = '*';
      }
    }
    
    System.out.println(new String(C));
  }
}