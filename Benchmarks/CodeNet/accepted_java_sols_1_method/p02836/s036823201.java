import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int l = S.length();
    int R = 0;
    for(int i = 0;i<l/2;i++){
      if(S.charAt(i)!=S.charAt(l-i-1)){
        R++;
      }
    }
    System.out.println(R);
  }
}