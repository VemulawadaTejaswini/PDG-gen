import java.util.*;
 
public class Main{
  public static int[] dp;
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] s = sc.nextLine().split(" ");
    int N = Integer.parseInt(s[0]);
    int K = Integer.parseInt(s[1])-1;
    String S = sc.nextLine();
    String str = "";
    if(S.charAt(K) == 'A'){
      str = "a";
    }else if(S.charAt(K) == 'B'){
      str = "b";
    }else{
      str = "c";
    }
    
    String ans = S.substring(0, K) + str + S.substring(K+1, N);

    System.out.println(ans);
  }
}