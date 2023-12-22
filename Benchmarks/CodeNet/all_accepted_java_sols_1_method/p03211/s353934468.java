import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    final int LIKE_NUM = 753;
    int min = Integer.MAX_VALUE;
    for(int i=0; i<S.length()-2; i++){
      int tmp = Integer.parseInt(S.substring(i, i+3));
      tmp = Math.abs(LIKE_NUM - tmp);
      min = Math.min(min, tmp);
    }
    System.out.print(min);
  }
}
