import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String T = sc.next();
    String S = sc.next();
    String[] oT = new String[T.length()-S.length()+1];
    for(int i = 0;i<oT.length;i++){
      oT[i] = T.substring(i,i+S.length());
    }
    int max = 0;
    for(int i = 0;i<oT.length;i++){
      int SM=0;
      for(int j = 0;j<S.length();j++){
        if(S.charAt(j)==oT[i].charAt(j)){
          SM++;
        }
      }
      if(SM>max){
        max = SM;
      }
    }
    System.out.println(S.length()-max);
  }
}