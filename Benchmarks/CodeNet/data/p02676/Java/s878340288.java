import java.util.*;
class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    int K = sc.nextInt();
    sc.nextLine();
    String S = sc.nextLine();
    if(K>=S.length()){
      System.out.println(S);
    }else{
      S = S.substring(0, K);
      System.out.println(S + "...");
    }
  }
}