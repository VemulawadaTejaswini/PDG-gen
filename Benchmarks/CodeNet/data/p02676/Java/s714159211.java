import java.util.*;
class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    int K = sc.nextInt();
    String S = sc.nextline();
    if(K>=S.length()){
      System.out.println(S);
    }else{
      S = S.substring(K-1);
      System.out.println(S + "...");
    }
  }
}