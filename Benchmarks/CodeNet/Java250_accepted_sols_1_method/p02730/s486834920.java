import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[] charS = S.toCharArray();
    int N = charS.length;
    boolean isStrong = true;
    for(int i=0; i<N; i++){
      if(charS[i] != charS[N-1-i]){
        isStrong=false;
        break;
      }
    }
    for(int i=0; i<(N-1)/2; i++){
      if(charS[i] != charS[(N-1)/2-1-i]){
        isStrong=false;
      }
    }
    for(int i=(N+3)/2-1; i<N; i++){
      if(charS[i] != charS[N-1-i]){
        isStrong=false;
      }
    }
    

    if(isStrong){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
