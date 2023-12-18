import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] S = sc.next().toCharArray();
    char[] T = sc.next().toCharArray();
    for(int i=0; i<S.length; i++){
      if(S[i] != T[i]){
        System.out.print("No");
        return;
      }
    }
    if(T.length - S.length == 1 ){
      System.out.print("Yes");
    }else{
      System.out.print("No");
    }
  }
}
